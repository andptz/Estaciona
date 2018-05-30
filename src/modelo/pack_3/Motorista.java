
package modelo.pack_3;

import modelo.pack_3.ValidacaoString.ValidacaoSTR;

public class Motorista extends PessoaFisica{
 
    private String cnh;
    
    //Construtor 1;
    public Motorista(int id, String nomeCompleto, Contato contato, String cpf,String cnh) {
        super(id, nomeCompleto, contato, cpf);
        this.cnh = cnh;
    }
    
    //Construtor 2;
    public Motorista(String nomeCompleto, Contato contato, String cpf,String cnh){
        super(nomeCompleto, contato, cpf);
        setCnh(cnh);
    }
    
    //========= GET ==================
    public String getCnh() {
        return cnh;
    }
    
    // ========= SET ==================
    public final void setCnh(String cnh) {
        
        if(ValidacaoSTR.validaCNH(cnh)){
            this.cnh = cnh;
        }else{
            throw new IllegalArgumentException("CNH invalido.");
        }
        
        
    }
   
}
