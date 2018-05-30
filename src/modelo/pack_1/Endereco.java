
package modelo.pack_1;

import modelo.pack_3.ValidacaoString.ValidacaoSTR;


public class Endereco {
    private int id;
    private String logradouro;
    private String complemento;
    private String cep;
    private Bairro bairro;
    private Cidade cidade;
    private Estado estado;
    
    
    //public final int TAM_CEP = 9;
    public final int TAM_COMPLEMENTO = 50;
    public final int TAM_LOGRADOURO = 100;

    
    @Override
    public String toString(){
        String texto;
        texto = "rua: " + this.logradouro;
        texto += "\nComplemento: " + this.complemento;
        texto += "\nCEP: " + this.cep;
        texto += "\nBairro: "  + this.bairro;
        texto += "\nCidade: " + this.cidade;
        texto += "\nbEstado: " + this.estado;
        return texto;
    }

    public Endereco(int id, String logradouro, String complemento, String cep, Bairro bairro, Cidade cidade, Estado estado) {
        this.id = id;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if(logradouro.length() <= TAM_LOGRADOURO && !logradouro.equals(""))
            this.logradouro = logradouro;
        else
            throw new IllegalArgumentException("Logradouro inválido!");
    }

    public Estado getEstado() {
        return bairro.getCidade().getEstado();
    }

    public Cidade getCidade() {
        return bairro.getCidade();
    }

    public Bairro getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (ValidacaoSTR.validaCEP(cep))
            this.cep = cep;
        else
            throw new IllegalArgumentException("CEP inválido!");
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if(complemento.length() <= TAM_COMPLEMENTO)
            this.complemento = complemento;
        else
            throw new IllegalArgumentException("Complemento inválido!");
    }

}

