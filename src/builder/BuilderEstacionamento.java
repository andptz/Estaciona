/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import modelo.componentes.Estacionamento;
import modelo.componentes.Vaga;
import modelo.locais.Bairro;
import modelo.locais.Cidade;
import modelo.operadores.Funcionario;
import modelo.locais.Endereco;
import modelo.locais.Estado;
/**
 *
 * @author Cacherow
 */
public class BuilderEstacionamento {
    private Estacionamento estacionamento;
    private Endereco endereco;
    private Vaga vaga;
    private Funcionario funcionario;
    

    public BuilderEstacionamento(Estacionamento estacionamento, Endereco endereco, Vaga vaga, Funcionario funcionario) {
        this.estacionamento = estacionamento;
        this.endereco = endereco;
        this.vaga = vaga;
        this.funcionario = funcionario;
    }
    
    
    
    
    
    public void builderEndereco(String logradouro, String cep, Bairro bairro, Cidade cidade, Estado estado){
        Endereco endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setCep(cep);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
    }
    
    public void builderVaga(int id, String status,int andar, int numero, String latitude, String longitude){
        Vaga vaga = new Vaga();
        vaga.setAndar(andar);
        vaga.setId(id);
        vaga.setLatitude(latitude);
        vaga.setNumero(numero);
        vaga.setStatus(status);
    }
    
    public void builderFuncionario extends PessoaFisica(String matricula, String dataAdmissao, String dataDemissao){
        Funcionario funcionario = new Funcionario();
        
            
    }
    
    
    
    
    
    
}
