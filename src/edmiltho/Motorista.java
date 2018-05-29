/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author 20131bsi0084
 */

//Motorista recebe CPF de henraça da classe Pessoa física, que herda da classe Pessoa
public class Motorista extends Pessoafisica{
    public Motorista(int _cpf){
        super(_cpf);
    }
    
    private String cnh;
    public final int TAM_CNH = 11;
    
    public Motorista(int _cpf, String cnh){
        super (_cpf);
        this.cnh = cnh;
    }


    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    public void getCnh() {
        if (cnh.length() != TAM_CNH || cnh.equals(""))
            throw new IllegalArgumentException("Rua inválida");
        else
            this.cnh = cnh;
    }
    
    
}
