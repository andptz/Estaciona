
package emanuelR;
import emanuelR.ValidacaoString.ValidacaoSTR;

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
    
    public Funcionario(String nomeCompleto, Contato contato, String cpf,
                       String matricula,String dataAdmissao,String dataDemissao){
            super(nomeCompleto, contato, cpf);
            setDataAdmissao(dataAdmissao);
            setDataDemissao(dataDemissao);
            setMatricula(matricula);
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
    public final void setMatricula(String matricula) {
        
        if(!matricula.equals("")){
            this.matricula = matricula;
        }else{
            throw new IllegalArgumentException("Matricula Inválida.");
        }
        
        
    }

    public final void setDataAdmissao(String dataAdmissao) {
        
        
        
       if(ValidacaoSTR.validaData(dataAdmissao)){
           this.dataAdmissao = dataAdmissao;
       }
        
        this.dataAdmissao = dataAdmissao;
    }

    public final void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
}
