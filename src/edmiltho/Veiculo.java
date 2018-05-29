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
public class Veiculo {
    private int id_placa;
    private int ano;
    private String nome;
    private String modelo;
    private String marca;

    public Veiculo(int id_placa, int ano, String nome, String modelo, String marca) {
        this.id_placa = id_placa;
        this.ano = ano;
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Veiculo(int ano, String nome, String modelo, String marca) {
        this.ano = ano;
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void setId_placa(int id_placa) {
        this.id_placa = id_placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId_placa() {
        return id_placa;
    }

    public int getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
    
    


    
}
