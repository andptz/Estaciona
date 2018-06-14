
package persistencia.locais;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.locais.Bairro;
import persistencia.utilidade.ConexaoBD;


public class PersistenciaBairro {
    Connection conexao = null;
    
    public void criarCidade(Bairro cidade) throws SQLException {
        String sql;
        sql = String.format("SELECT B.nome FROM bairro B WHERE B.nome LIKE '%s' AND B.FK_CIDADE_id = %d;", cidade.getNome(), cidade.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        /*
        if (!statement.executeQuery(sql).first()){
            sql = String.format("INSERT INTO bairro (nome, FK_CIDADE_id) "
                    + "VALUES (%s, %d)", cidade.getNome(), cidade.getFK_ESTADO_id());
            
            statement.executeUpdate(sql);
            System.out.println("Nova cidade registrada com sucesso!");
        }*/
    }
}
