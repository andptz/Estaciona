
package modelo.pack_3;

public final class Contato {
    
    private int id;
    private String email;
    private String telefone1;
    private String telefone2;
    
    
    //Construtor 1 : Utilizado para acomodar Contatos já adicionados no Banco.
    public Contato(int id_contato,String email,String telefone1,String telefone2){
        
        this.id = id_contato;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }
    
    //Construtor 2: Utilizado para acomodar novos Contatos;
    public Contato(String email,String telefone1,String telefone2){

        setEmail(email);
        setTelefone1(telefone1);
        setTelefone2(telefone2);
          
    }
       
    // ========= GET  ============
    public int getId_contato() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefone1() {
        return telefone1;
    }
    
    public String getTelefone2() {
        return telefone2;
    }
    // ========= SET ==============
    
    public void setEmail(String email) {
        
        //Verifica se o campo email está vazio;
        if(!email.equals("")){
            this.email = email;
        }else{
            throw new IllegalArgumentException("Email Invalido.");
        }
 
    }
 
    public void setTelefone1(String telefone1) {
        
        //Verifica se o campo telefone está vazio;
        if(!telefone1.equals("")){
            this.telefone1 = telefone1;
        }else{
            throw new IllegalArgumentException("Telefone 1 Invalido.");
        }
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    // ============================

    
}
