
package persistencia.operadores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.operadores.Motorista;

import persistencia.utilidade.ConexaoBD;



public class PersistenciaMotorista {
    
    Connection conexao = null;
    
    public void insertMotorista (Motorista motorista) throws SQLException{
 
        int chaveEstrangeira = 0;
        
        conexao = ConexaoBD.conectar();
        //========================================         
        //Criar pessoa;
        PreparedStatement ps = conexao.prepareStatement("Insert into pessoa(nome,telefone,email,senha)" + 
                "values (?,?,?,?) returning id;");
        
        ps.setString(1,motorista.getNomeCompleto());
        ps.setString(2,motorista.getTelefone());
        ps.setString(3,motorista.getEmail());
        ps.setString(4,motorista.getSenha());
        
        //Executa SQL e guarda ID;
        ResultSet rs = ps.executeQuery();
        
        //Verifica se possui algum retorno;
        try{
            if(rs.next()){
                chaveEstrangeira = rs.getInt("id");
                System.out.print("\nCHAVE: "+ chaveEstrangeira);
            }
        }catch(SecurityException e){
            
        }
        
        //=============================================
        //Cria Pessoa Fisica;
        ps = conexao.prepareStatement("Insert into pessoa_fisica(cpf,fk_pessoa_id)" + 
                "values (?,?) returning id;");
        
        ps.setString(1,motorista.getCpf());
        ps.setString(2,""+chaveEstrangeira);
        
        //Executa SQL e guarda ID;
        rs = ps.executeQuery();
        if(rs.next()){
            chaveEstrangeira = rs.getInt("id");
            System.out.print("\nCHAVE: "+ chaveEstrangeira);
        }
        
        
        ps.close();
        conexao.close();
    }



}
