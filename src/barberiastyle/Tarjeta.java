
import barberiastyle.metodoPago;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *

import barberiastyle.metodoPago;

/**
 *
 * @author Ivan
 */
public class Tarjeta extends metodoPago {
    int numeroTarjeta;
    public Tarjeta(int valor, int numeroTarjeta) {
        super(valor);
        this.numeroTarjeta=numeroTarjeta;
        
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
}
