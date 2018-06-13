
package persistencia.locais;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.locais.Estado;
import persistencia.utilidade.ConexaoBD;


public class PersistenciaCidade {
    Connection conexao = null;
    
    
}















public class PersistenciaEstado {
    Connection conexao = null;
    
    public void salvarEstado(Estado estado) throws SQLException{
        String sql = "INSERT INTO estado (nome) "+
                "values ('"
                +estado.getNome()+
                "')";
        ConexaoBD.executeSQL(sql);
    }

    public ArrayList recuperarTodos() throws ClassNotFoundException, SQLException{
        ArrayList<Estado> listaEstados = new ArrayList<>();
        String sql ="SELECT * FROM estado";
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Estado estado = new Estado();
                estado.setId(rs.getInt("id"));
                estado.setNome(rs.getString("nome"));
                listaEstados.add(estado);
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaEstados;
    }

}
