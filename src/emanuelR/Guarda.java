
package emanuelR;

public class Guarda extends Funcionario {
    
    //Construtor 1;
    public Guarda(int id, String nomeCompleto, Contato contato, String cpf) {
        super(id, nomeCompleto, contato, cpf);
    }
    
    //Construtor 2;
    public Guarda (String nomeCompleto, Contato contato,String cpf){
        super(nomeCompleto,contato,cpf);
    
    }
    
}
