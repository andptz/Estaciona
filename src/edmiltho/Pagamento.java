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
public class Pagamento {
    private int valor;

    public Pagamento(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor!=0)
            this.valor = valor;
        else
             throw new IllegalArgumentException("Valor vazio");
    }
    
    
}
