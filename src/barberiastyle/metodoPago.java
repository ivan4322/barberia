/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberiastyle;

/**
 *
 * @author Ivan
 */
public class metodoPago {
    private int valor;
   private int idMetodopago;
   private static int contadorMetodo;
   
   
   public metodoPago(){
      this.idMetodopago=++metodoPago.contadorMetodo;  
   }

    public metodoPago(int valor) {
        this.valor=valor;
        this.idMetodopago=++metodoPago.contadorMetodo;
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "metodoPago{" + "valor=" + valor + ", idMetodopago=" + idMetodopago + '}';
    }


    
    
      
}
