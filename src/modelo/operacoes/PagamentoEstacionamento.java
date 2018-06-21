/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;

import modelo.componentes.Vaga;
import modelo.operadores.Motorista;

public class PagamentoEstacionamento{
    
    private int id;
    private double valor;
    private String data;
    private Vaga vaga;
    private Motorista motorista;

    public PagamentoEstacionamento(int id, double valor, String data, Vaga vaga, Motorista motorista) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.vaga = vaga;
        this.motorista = motorista;
    }

    public PagamentoEstacionamento(double valor, String data, Vaga vaga, Motorista motorista) {
        this.valor = valor;
        this.data = data;
        this.vaga = vaga;
        this.motorista = motorista;
    }

    public PagamentoEstacionamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }
    
    public PagamentoEstacionamento(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.equals(""))
            this.data = data;
        else
             throw new IllegalArgumentException("Data inválida");
    }
    
}
