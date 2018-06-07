package modelo.operadores;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    
    private static final int TAM_CNPJ = 14;
    
    //Construtor 1;
    public PessoaJuridica(int id, String nomeCompleto, Contato contato,String cnpj) {
        super(id, nomeCompleto, contato);
        this.cnpj = cnpj;
    }
    
    //Construtor 2;
    public PessoaJuridica(String nomeCompleto, Contato contato,String cnpj){
        super(nomeCompleto, contato);
        setCnpj(cnpj);
    }
    
    // ======== GET ============
    public String getCnpj() {
        return cnpj;
    }
    
    //========= SET ===========
    public final void setCnpj(String cnpj) {
       
        if(cnpj.length() == TAM_CNPJ){
            this.cnpj = cnpj;
        }else{
            throw new IllegalArgumentException("CPNJ invalido.");
        }
        
    }
    
    
    
}
