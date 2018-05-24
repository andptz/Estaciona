
package classes;

public class Guarda extends Funcionario {
    
    public Guarda(int id, String nomeCompleto, Contato contato, String cpf) {
        super(id, nomeCompleto, contato, cpf);
    }
    
    public Guarda (String nomeCompleto, Contato contato,String cpf){
        super(nomeCompleto,contato,cpf);
    
    }
    
}
