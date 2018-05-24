
package andreangelo;

import emanuelR.ValidacaoString.ValidacaoSTR;


public class Endereco {
    private Bairro bairro;
    private Cidade cidade;
    private Estado estado;
    private String cep;
    private String rua;
    private String complemento;
    public final int TAM_CEP = 9;
    public final int TAM_COMPLEMENTO = 50;
    public final int TAM_RUA = 100;

    
    @Override
    public String toString(){
        String texto;
        texto = "rua: " + this.rua;
        texto += "\nCEP: " + this.cep;
        texto += "\nComplemento: " + this.complemento;
        texto += "\nBairro: "  + this.bairro;
        texto += "\nCidade: " + this.cidade;
        texto += "\nbEstado: " + this.estado;
        return texto;
    }

    public Endereco(Estado estado, Cidade cidade, Bairro bairro, String cep, String rua, String complemento) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.rua = rua;
        this.complemento = complemento;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if(rua.length() <= TAM_RUA && !rua.equals(""))
            this.rua = rua;
        else
            throw new IllegalArgumentException("Rua inválida");
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

