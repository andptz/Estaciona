
package modelo.operadores;

public class Motorista extends PessoaFisica{
 
    private String cnh;
    
    
    //Quantidade de caracter CNH;
    private static final int TAMANHO_CNH = 11;

    public Motorista(int id, String nomeCompleto, String email, String telefone, String cpf, String cnh) {
        super(id, nomeCompleto, email, telefone, cpf);
        this.cnh = cnh;
    }
    
     public Motorista(String nomeCompleto, String email, String telefone, String cpf, String cnh) {
        super(nomeCompleto, email, telefone, cpf);
        setCnh(cnh);
    }
    
    //========= GET ==================
    public String getCnh() {
        return cnh;
    }
    
    // ========= SET ==================
    public final void setCnh(String cnh) {
        
        if(cnh.length() == TAMANHO_CNH){
            this.cnh = cnh;
        }else{
            throw new IllegalArgumentException("CNH invalido.");
        }
        
        
    }
   
}
