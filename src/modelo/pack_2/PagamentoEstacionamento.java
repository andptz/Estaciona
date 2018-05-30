/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pack_2;

/**
 *
 * @author Edmiltho
 */
public class PagamentoEstacionamento extends Pagamento {
    
    public PagamentoEstacionamento(int _valor){
        super(_valor);
    }
    
    private String status;
    private String data;

    public PagamentoEstacionamento(String status, String data, int valor) {
        super(valor);
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public String getData() {
        return data;
    }

    public void setStatus(String status) {
        if(!status.equals(""))
            this.status = status;
        else
             throw new IllegalArgumentException("Status inválido");
    }

    public void setData(String data) {
        if(!data.equals(""))
            this.data = data;
        else
             throw new IllegalArgumentException("Data inválida");
    }
    
    
}