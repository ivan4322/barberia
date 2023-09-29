/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberiastyle;



/**
 *
 * @author Ivan
 */
public class Barbero  extends Persona{
      
    private int idBarbero;
     boolean certificado = false;
     private static int contadorBarbero;
    
    
    public Barbero (){
        this.idBarbero= ++Barbero.contadorBarbero;
    }

    public Barbero(String nombre, String apellido,boolean certificado) {
        super(nombre, apellido);
      this.certificado=certificado; 
      
       this.idBarbero= ++Barbero.contadorBarbero; 
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Barbero{" + "idBarbero=" + idBarbero + ", certificado=" + certificado + '}';
    }
    
    
    
    
}
