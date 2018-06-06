
package modelo.operadores;

public class Guarda extends Funcionario {
    
    public Guarda(int id, String nomeCompleto, Contato contato, String cpf, String matricula, String dataAdmissao, String dataDemissao) {
        super(id, nomeCompleto, contato, cpf, matricula, dataAdmissao, dataDemissao);
    }
    
    public Guarda(String nomeCompleto, Contato contato, String cpf, String matricula, String dataAdmissao, String dataDemissao) {
        super(nomeCompleto, contato, cpf, matricula, dataAdmissao, dataDemissao);
    }
  
    
}
