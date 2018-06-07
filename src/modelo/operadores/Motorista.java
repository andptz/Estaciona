
package modelo.operadores;

public class Motorista extends PessoaFisica{
 
    private String cnh;
    
    
    //Quantidade de caracter CNH;
    private static final int TAMANHO_CNH = 11;
    
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
        
        if(cnh.length() == TAMANHO_CNH){
            this.cnh = cnh;
        }else{
            throw new IllegalArgumentException("CNH invalido.");
        }
        
        
    }
   
}