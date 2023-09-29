/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberiastyle;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class Cliente  extends Persona{
    
    
      private int idCliente;
       private Date hora;
      private int telefono,contraseña;
      private static int contadorCliente;

    public Cliente() {
       this.idCliente=++Cliente.contadorCliente; 
       hora = new Date();
        System.out.println("hora de registro " + hora);
      
    }

    public Cliente(String nombre, String apellido, Date hora, int telefono,int contraseña) {
        super(nombre, apellido);
        
        this.contraseña=contraseña;
        this.telefono=telefono;
        this.idCliente=++Cliente.contadorCliente;
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", telefono=" + telefono + ", contrase\u00f1a=" + contraseña + '}';
    }
    
     
     
}
