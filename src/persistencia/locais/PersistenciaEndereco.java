
package persistencia.locais;

import java.sql.Connection;


public class PersistenciaEndereco {
    Connection conexao = null;
    
    public void criarEndereco(Cidade) throws SQLException{
        String sql;
        
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
    
}
