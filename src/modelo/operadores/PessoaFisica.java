package modelo.operadores;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
      
    //Construtor 1;
    public PessoaFisica(int id, String nomeCompleto, String email,String telefone, String cpf) {
        super(id, nomeCompleto,email,telefone);
        this.cpf = cpf;       
    }
    
    //Construtor 2;
    public PessoaFisica(String nomeCompleto,String email,String telefone, String cpf){
        super(nomeCompleto,email,telefone);
        setCpf(cpf);
    }
    
    //========= GET ===============
    public String getCpf() {
        return cpf;
    }
    
    //========= SET ===============
    public final void setCpf(String cpf) {
        
        if(!cpf.equals("")){
            this.cpf = cpf;
        }else{
            throw new IllegalArgumentException("CPF Inválida.");
        }
        
    }
    
    
    
}
