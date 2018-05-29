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
        if(ano<=1930)
            throw new IllegalArgumentException("Ano inválido");
        else
            this.ano=ano;          
    }

    public void setNome(String nome) {
        if(!nome.equals(""))
            this.nome = nome;
        else
            throw new IllegalArgumentException("Nome vazio");
    }

    public void setModelo(String modelo) {
        if(!modelo.equals(""))
            this.modelo = modelo;
        else
            throw new IllegalArgumentException("Modelo inválido");
    }

    public void setMarca(String marca) {
        if(!marca.equals(""))
            this.marca = marca;
        else
            throw new IllegalArgumentException("Marca inválida");
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
