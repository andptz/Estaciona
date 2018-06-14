
package persistencia.locais;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.locais.Bairro;
import modelo.locais.Cidade;
import modelo.locais.Estado;
import persistencia.utilidade.ConexaoBD;


public class PersistenciaCidade {
    Connection conexao = null;
    
    public void criarCidade(Cidade cidade) throws SQLException{
        String sql;

        sql = String.format("SELECT C.nome FROM cidade C WHERE C.nome LIKE '%s' AND C.FK_ESTADO_id = %s;", cidade.getNome(), cidade.getEstado().getId());

        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        //Se não existir uma cidade de mesmo nome da que se está tentando registrar, em um determinado estado, então o registro é permitido.
        if (!statement.executeQuery(sql).first()) {
            sql = String.format("INSERT INTO cidade (nome, FK_ESTADO_id) "
                    + "VALUES (%s, %d)", cidade.getNome(), cidade.getFK_ESTADO_id());
            
            statement.executeUpdate(sql);
            System.out.println("Nova cidade registrada com sucesso!");
        }
        else
            System.out.println("Cidade já existente no banco de dados!");
        
        statement.close();
        conexao.close();
    }
    
    //Método que retorna num Array, as cidades (recuperadas de um banco de dados) de um determinado estado.
    public ArrayList recuperarCidadesDeEstado(Estado estado) throws SQLException{
        String sql;
        ArrayList<Cidade> listaCidades = new ArrayList<>();
        //Seleciona as cidades de um determinado estado.
        sql = String.format("SELECT * FROM cidade C WHERE C.FK_ESTADO_id = %d;", estado.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        if (statement.executeQuery(sql).first()) {
            //exeucta a query no banco de dados
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                Cidade cidade = new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setFK_ESTADO_id(estado.getId());
                cidade.setEstado(estado);
                listaCidades.add(cidade);
            }
        }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaCidades;
    }
    
}