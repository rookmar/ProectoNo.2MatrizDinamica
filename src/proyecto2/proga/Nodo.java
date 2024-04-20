/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.proga;

/**
 *
 * @author Marlon Ramirez
 */
public class Nodo {
    
    Vehiculo vehiculo;
    Nodo derecha;
    Nodo abajo;

    public Nodo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.derecha = null;
        this.abajo = null;
    }
    public Nodo Buscar(String placa){
        Nodo temp = this;
        while (temp != null){
            if (temp.vehiculo.equals(placa)){
                return temp;
            }
            temp = temp.derecha;
        }
        return null;
    }
    
    
    
}
