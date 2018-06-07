
package persistencia.locais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.locais.Estado;



public class PersistenciaEstado {
    
    public void executeSQL(String sql) throws SQLException {
        
        Connection connection = null;
        Statement stament = null;
        try {
            //verifica se as classe da biblioteca existem
         Class.forName("org.sqlite.JDBC");
         //abre a conexao com o  banco de dados chamado lanchonete.
         //esse banco de dado é em arquivo
         connection  = DriverManager.getConnection("jdbc:sqlite:BD_ESTACIONA.db");
         System.out.println("Banco de dados aberto");
         stament = connection.createStatement();
         //exeucta o sql no meu banco de dados
         stament.executeUpdate(sql);
         stament.close();
         //fecha a conexao com o banco de dados
         connection.close();
         
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        } catch (SQLException ex) {
                ex.printStackTrace();
                throw ex;
        }
    }


    public void salvarEstado(Estado estado) {
        
        String sql="INSERT INTO estado (nome) "+
                "values ('"
                +estado.getNome()+
                "')";
        
        this.executeSQL(sql);
    }
        
        
    }
    
}
