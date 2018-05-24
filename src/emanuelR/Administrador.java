
package emanuelR;

import emanuelR.ValidacaoString.ValidacaoSTR;

public class Administrador extends Funcionario {
    
    private String senha;
    
    //Construtor 1;
    public Administrador(int id, String nomeCompleto, Contato contato, String cpf, String matricula, String dataAdmissao, String dataDemissao,String senha) {
        super(id, nomeCompleto, contato, cpf, matricula, dataAdmissao, dataDemissao);
        this.senha = senha;
    }
    
    //Construtor 2;
    public Administrador(String nomeCompleto, Contato contato, String cpf, String matricula, String dataAdmissao, String dataDemissao,String senha) {
        super(nomeCompleto, contato, cpf, matricula, dataAdmissao, dataDemissao);
        this.senha = senha;
    }
    
    // ======== GET ==========
    public String getSenha() {
        return senha;
    }
    
    // ======== SET ==========
    public void setSenha(String senha) {
        
        if(ValidacaoSTR.validaSENHA(senha)){
            this.senha = senha;
        }else{
            throw new IllegalArgumentException("Data Admissao Invalida.");
        }
        
        
    }
    
    
}
