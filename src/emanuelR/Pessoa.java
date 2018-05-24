
package classes;

public class Pessoa {
    
    private int id;
    private String nomeCompleto;
    private Contato contato;

   
    //Construtor 1;
    public Pessoa(int id, String nomeCompleto, Contato contato){
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.contato = contato;
    
    }
    //Construtor 2;
    public Pessoa (String nomeCompleto,Contato contato){
        setNomeCompleto(nomeCompleto);
        this.contato = contato;
    
    }
    
    // ============ GET ===============
    public int getId_pessoa() {
        return id;
    }
    public Contato getContato() {
        return contato;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    // ============ SET ================
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    public final void setNomeCompleto(String nomeCompleto) {
        if(!nomeCompleto.equals("")){
        
        }else{
        
        }
        
        
        this.nomeCompleto = nomeCompleto;
    }
    
}
