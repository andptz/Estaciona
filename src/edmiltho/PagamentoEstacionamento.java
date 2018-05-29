/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author Cacherow
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
        this.status = status;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
