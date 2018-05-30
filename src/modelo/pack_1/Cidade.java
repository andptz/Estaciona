
package modelo.pack_1;

import java.util.ArrayList;


public class Cidade {
    private int id;
    private String nome;
    private Estado estado;
    private ArrayList<Bairro> lista_bairros;

    
    public Cidade(int id_cidade, String nome, Estado estado, ArrayList<Bairro> lista_bairros) {
        this.id = id_cidade;
        this.nome = nome;
        this.estado = estado;
        this.lista_bairros = lista_bairros;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Bairro> getLista_bairros() {
        return lista_bairros;
    }

    public void setLista_bairros(ArrayList<Bairro> lista_bairros) {
        this.lista_bairros = lista_bairros;
    }
   
}
