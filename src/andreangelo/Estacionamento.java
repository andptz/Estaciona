
package andreangelo;
import classes.Administrador;
import classes.Guarda;
import classes.PessoaJuridica;
import java.util.ArrayList;


public class Estacionamento {
    private int id;
    private String nome;
    private int qtdVagas;
    private Endereco endereco;
    private double valorHora;
    private Guarda guarda;
    private ArrayList<Administrador> listaAdministradores;
    private ArrayList<Vaga> listaVagas;
    private PessoaJuridica pessoaJuridica;

    
    public Estacionamento(int id, String nome, int qtdVagas, Endereco endereco, double valorHora, Guarda guarda, ArrayList<Administrador> listaAdministradores, ArrayList<Vaga> listaVagas, PessoaJuridica pessoaJuridica) {
        this.id = id;
        this.nome = nome;
        this.qtdVagas = qtdVagas;
        this.endereco = endereco;
        this.valorHora = valorHora;
        this.guarda = guarda;
        this.listaAdministradores = listaAdministradores;
        this.listaVagas = listaVagas;
        this.pessoaJuridica = pessoaJuridica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Guarda getGuarda() {
        return guarda;
    }

    public void setGuarda(Guarda guarda) {
        this.guarda = guarda;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    public ArrayList<Vaga> getListaVagas() {
        return listaVagas;
    }

    public void setListaVagas(ArrayList<Vaga> listaVagas) {
        this.listaVagas = listaVagas;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
    
    
    
    
}
