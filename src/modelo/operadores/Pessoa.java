
package modelo.operadores;

public class Pessoa {
    
    private int id;
    private String nomeCompleto;
    private String email;
    private String telefone;

   
    //Construtor 1;
    public Pessoa(int id, String nomeCompleto, Contato contato){
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        
    
    }
    //Construtor 2;
    public Pessoa (String nomeCompleto,Contato contato){
        setNomeCompleto(nomeCompleto);
        
    
    }
    
    // ============ GET ===============
    public int getId_pessoa() {
        return id;
    }
   
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    // ============ SET ================
  
    public final void setNomeCompleto(String nomeCompleto) {
        if(!nomeCompleto.equals("")){
            this.nomeCompleto = nomeCompleto;
        }else{
            throw new IllegalArgumentException("Nome em branco.");
        }      
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }


}
