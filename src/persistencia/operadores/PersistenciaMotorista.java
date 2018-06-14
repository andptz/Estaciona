
package persistencia.operadores;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.operadores.Motorista;

import persistencia.utilidade.ConexaoBD;



public class PersistenciaMotorista {
    
    Connection conexao = null;
    
    public void insertMotorista (Motorista motorista) throws SQLException{
 
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        String sql = String.format("INSERT INTO pessoa (nome,telefone,email,senha) "
        + "VALUES (%s, %s, %s, %s);", 
                
        motorista.getNomeCompleto(), motorista.getTelefone(), motorista.getEmail(),motorista.getSenha());
        
        statement.executeUpdate(sql);
        statement.close();
        conexao.close();
    }



}
