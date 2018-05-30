package modelo.pack_3;

import modelo.pack_3.ValidacaoString.ValidacaoSTR;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    
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
       
        if(ValidacaoSTR.validaCNPJ(cnpj)){
            this.cnpj = cnpj;
        }else{
            throw new IllegalArgumentException("CPNJ invalido.");
        }
        
    }
    
    
    
}
