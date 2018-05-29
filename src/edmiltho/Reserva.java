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
public class Reserva {
    private int id;
    private String horaReserva;
    private String dataReserva;

    public Reserva(int id, String horaReserva, String dataReserva) {
        this.id = id;
        this.horaReserva = horaReserva;
        this.dataReserva = dataReserva;
    }

    public Reserva(String horaReserva, String dataReserva) {
        this.horaReserva = horaReserva;
        this.dataReserva = dataReserva;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoraReserva(String horaReserva) {
        if (horaReserva.equals(""))
            throw new IllegalArgumentException("Hora inválida");
        else
            this.horaReserva = horaReserva;
    }

    public void setDataReserva(String dataReserva) {
        if (dataReserva.equals(""))
            throw new IllegalArgumentException("Data inválida");
        else
            this.dataReserva = dataReserva;
    }
    
    
}


