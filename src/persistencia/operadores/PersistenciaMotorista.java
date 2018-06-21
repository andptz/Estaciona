
package persistencia.operadores;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import modelo.operadores.Motorista;
import modelo.operadores.Pessoa;

import persistencia.utilidade.ConexaoBD;



public class PersistenciaMotorista {
    
    Connection conexao = null;
    
 
    //Metodo que retorna um array com todas as vagas do banco de dados.
    public int loginMotorista(String email,String senha) throws ClassNotFoundException, SQLException{
        
        
        conexao = ConexaoBD.conectar();
        //========================================         
        //Criar pessoa;
        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM pessoa WHERE  email = ? and senha = ?");
        
        ps.setString(1,email); // Email
        ps.setString(2,senha); // Senha
      
        
        //Executa SQL e guarda ID;
        ResultSet rs = ps.executeQuery();
        
        System.out.print("Ok");
        
        if(rs.next()){
            
            return rs.getInt("id");
            
        }else{
        
            JOptionPane.showMessageDialog(null,"Dados Inválidos.");
            
            return 0;
        }  
           
    }
    
    
    
    public void insertMotorista (Motorista motorista) throws SQLException{
 
        int chaveEstrangeira = 0;
        
        conexao = ConexaoBD.conectar();
        
        //Verifica se exite alguem com o cpf já cadastrado;
        PreparedStatement ps = conexao.prepareStatement("Select cpf from pessoa_fisica where cpf = ?;");
        ps.setString(1,motorista.getCpf()); // CPF
        
        ResultSet rs = ps.executeQuery();
        
        //Verifica de encontrou algum CPF;
        if(rs.next()){
            JOptionPane.showMessageDialog(null,"CPF "+rs.getString("cpf") +" já cadastrado.");
            
        }else{
            
            //========================================         
            //Criar pessoa;
            ps = conexao.prepareStatement("Insert into pessoa(nome,telefone,email,senha)" + 
                    "values (?,?,?,?) returning id;");

            ps.setString(1,motorista.getNomeCompleto()); // Nome
            ps.setString(2,motorista.getTelefone()); // Telefone
            ps.setString(3,motorista.getEmail()); // Email
            ps.setString(4,motorista.getSenha()); // Senha

            //Executa SQL e guarda ID;
            rs = ps.executeQuery();

            //Verifica se possui algum retorno;
            if(rs.next()){
                chaveEstrangeira = rs.getInt("id");
                System.out.print("\nCHAVE: "+ chaveEstrangeira);
             }else{
                throw new SQLException("Erro em carrega chave Estrangeira.");
            }


            //=============================================
            //Cria Pessoa Fisica;
            ps = conexao.prepareStatement("Insert into pessoa_fisica(cpf,fk_pessoa_id)" + 
                    "values (?,?) returning fk_pessoa_id;");

            ps.setString(1,motorista.getCpf()); // CPF
            ps.setInt(2,chaveEstrangeira); // FK Pessoa

            //Executa SQL e guarda ID;
            rs = ps.executeQuery();
            


            
            //=============================================
            //Cria Motorista;
            ps = conexao.prepareStatement("Insert into motorista(creditos,cnh,fk_pessoa_fisica_fk_pessoa_id)" + 
                    "values (?,?,?) returning cnh;");
            
            ps.setDouble(1,0.0); // Créditos
            ps.setString(2,motorista.getCnh());// CNH
            ps.setInt(3,chaveEstrangeira); // FK Pessoa Fisica
            
            //Executa SQL e guarda ID;
            rs = ps.executeQuery();
            
        }
        
        ps.close();
        conexao.close();
    }



}
