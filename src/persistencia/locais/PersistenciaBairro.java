
package persistencia.locais;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.locais.Bairro;
import modelo.locais.Cidade;
import persistencia.utilidade.ConexaoBD;


public class PersistenciaBairro {
    Connection conexao = null;
   
    public ArrayList recuperarBairrosDeCidade(Cidade cidade) throws SQLException{
        String sql;
        ArrayList<Bairro> listaBairros = new ArrayList<>();
        //Seleciona as cidades de um determinado estado.
        sql = String.format("SELECT * FROM bairro B WHERE B.FK_CIDADE_id = %d;", cidade.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        //Se ouver algum registro de bairro para uma determinada cidade então...
        if (statement.executeQuery(sql).first()) {
            //exeucta a query no banco de dados
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                Bairro bairro = new Bairro();
                bairro.setId(rs.getInt("id"));
                bairro.setNome(rs.getString("nome"));
                bairro.setFK_CIDADE_id(cidade.getId());
                bairro.setCidade(cidade);
                listaBairros.add(bairro);
            }
        }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaBairros;
    }
    
}
