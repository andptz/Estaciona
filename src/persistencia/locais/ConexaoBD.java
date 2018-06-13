
package persistencia.locais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {
    Connection connection = null;
    
    public static Connection conectar() throws SQLException{
        String sql ="SELECT * FROM estado";
        Connection connection = null;
        
        String url = "jdbc:postgresql://localhost:5432/BD_ESTACIONA";
        String usuario = "postgres";
        String senha = "J3sus";

        try {
            //verifica se as classe da biblioteca existem
            Class.forName("org.postgresql.Driver");
            //abre a conexao com o  banco de dados chamado BD_ESTACIONA.
            connection = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("Banco de dados aberto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }


}
