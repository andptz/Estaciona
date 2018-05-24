
package classes;

public class Funcionario extends PessoaFisica {

    
    private String matricula;
    private String dataAdmissao;
    private String dataDemissao;
    
    
    public Funcionario(int id, String nomeCompleto, Contato contato, String cpf,
                       String matricula,String dataAdmissao,String dataDemissao) {
        
        super(id, nomeCompleto, contato, cpf);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }
    
    public Funcionario(String nomeCompleto, Contato contato, String cpf){
            super(nomeCompleto, contato, cpf);
    }

    // ========= GET ==============
    public String getMatricula() {
        return matricula;
    }
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }
     
    public String getDataDemissao() {
        return dataDemissao;
    }
    
    
    // ========= SET ===============
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
}
