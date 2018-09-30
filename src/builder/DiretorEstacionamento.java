/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import modelo.componentes.Estacionamento;
import modelo.componentes.Vaga;
import modelo.operadores.Funcionario;
import builder.BuilderEstacionamento;
import modelo.locais.Endereco;



/**
 *
 * @author Cacherow
 */
public class DiretorEstacionamento {
    
    public Estacionamento builder(Endereco endereco, Vaga vaga, Funcionario funcionario) throws Exception{
        Estacionamento estacionamento = new Estacionamento();
        BuilderEstacionamento bd = new BuilderEstacionamento(Estacionamento estacionamento, Endereco endereco, Vaga vaga, Funcionario funcionario);
        builderEstaciona.adicionaEndereco();
        builderEstaciona.adicionaVaga;
        builderEstaciona.adicionaFuncionario();
        
    }
}
