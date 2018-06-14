
package modelo.operadores;

public class Motorista extends PessoaFisica{
 
    private String cnh;
    private String senha;
    
    //Quantidade de caracter CNH;
    private static final int TAMANHO_CNH = 11;

    public Motorista(int id, String nomeCompleto, String email, String telefone, String cpf, String cnh,String senha) {
        super(id, nomeCompleto, email, telefone, cpf);
        this.cnh = cnh;
        this.senha = senha;
    }
    
     public Motorista(String nomeCompleto, String email, String telefone, String cpf, String cnh,String senha) {
        super(nomeCompleto, email, telefone, cpf);
        setCnh(cnh);
        setSenha(senha);
    }
    
    //========= GET ==================
    public String getCnh() {
        return cnh;
    
    }
   
    public String getSenha() {
        return senha;
    }
    
    // ========= SET ==================
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public final void setCnh(String cnh) {
        
        if(cnh.length() == TAMANHO_CNH){
            this.cnh = cnh;
        }else{
            throw new IllegalArgumentException("CNH invalido.");
        }
        
        
    }
   
}
