
package modelo.operadores;

public class Administrador extends Funcionario {
    
    private String senha;
  
    //Construtor 1;
    public Administrador(int id, String nomeCompleto, String email, String telefone,String cpf,
                       String matricula,String dataAdmissao,String dataDemissao, String senha, String confirSenha) {
        
        super(id,nomeCompleto, email, telefone, cpf, matricula, dataAdmissao, dataDemissao);
        
        this.senha = senha;
    
    }
    
    //Construtor 2;
    public Administrador(String nomeCompleto, String email, String telefone,String cpf,
                       String matricula,String dataAdmissao,String dataDemissao, String senha, String confirSenha) {
        
        super(nomeCompleto, email, telefone, cpf, matricula, dataAdmissao, dataDemissao);
        setSenha(senha);
        
    }
    
    // ======== GET ==========
    public String getSenha() {
        return senha;
    }
    
    // ======== SET ==========
    public void setSenha(String senha) {
        
        if(!senha.equals("")){
            this.senha = senha;
        }else{
            throw new IllegalArgumentException("Senha Invalida.");
        }
        
        
    }
    
    
}
