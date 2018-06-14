
package modelo.operadores;

public class Pessoa {
    
    //Variaveis;
    private int id;
    private String nomeCompleto;
    private String email;
    private String telefone;

   
    //Construtor 1;
    public Pessoa(int id, String nomeCompleto,String email,String telefone){
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
    }
    
    //Construtor 2;
    public Pessoa (String nomeCompleto,String email,String telefone){
        
        setNomeCompleto(nomeCompleto);
        setTelefone(telefone);
        setEmail(email);
       
        
        
    }
    
    // ============ GET ===============
    public int getId_pessoa() {
        return id;
    }
   
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
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
