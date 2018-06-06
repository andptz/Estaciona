package modelo.operadores;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
      
    //Construtor 1;
    public PessoaFisica(int id, String nomeCompleto, Contato contato, String cpf) {
        super(id, nomeCompleto, contato);
        this.cpf = cpf;       
    }
    
    //Construtor 2;
    public PessoaFisica(String nomeCompleto, Contato contato, String cpf){
        super(nomeCompleto,contato);
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
