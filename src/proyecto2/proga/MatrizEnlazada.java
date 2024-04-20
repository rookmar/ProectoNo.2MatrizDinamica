/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.proga;

/**
 *
 * @author Marlon Ramirez
 */
public class MatrizEnlazada {
    
    Nodo primeraFila;
    Nodo primeraColumna;
    //Nodo primerNodo;

    public MatrizEnlazada() {
        this.primeraFila = null;
        this.primeraColumna = null;
       // this.primerNodo = null;
    }
    
    public void agregarvehiculo(Vehiculo vehiculo){
        
        
        Nodo nuevoNodo = new Nodo(vehiculo);
        if (primeraFila == null){
            primeraFila = nuevoNodo;
            primeraColumna = nuevoNodo;
            return;   
        }
        
        Nodo temp = primeraFila;
        while (temp.derecha != null){
            temp = temp.derecha;
        }
        temp.derecha = nuevoNodo;
        
        temp = primeraColumna;
        while (temp.derecha != null){
            temp = temp.derecha;
        }
        temp.derecha = new Nodo(vehiculo);

    }
    
    public void imprimirmatriz(){
        
        Nodo NodoActual = primeraFila;
        
        while (NodoActual != null){

        Vehiculo vehiculo = NodoActual.vehiculo;      
        System.out.println("LA PLACA DEL VEHICULO ES: " + vehiculo.getPlaca());
        System.out.println("EL COLOR DEL VEHICULO ES: " + vehiculo.getColor());
        System.out.println("LA LINEA O MARCA DEL VEHICULO ES: " + vehiculo.getLinea());
        System.out.println("EL MODELO DEL VEHICULO ES: " + vehiculo.getModelo());
        System.out.println("EL PROPIETARIO DEL VEHICULO ES: " + vehiculo.getPropietario());
        System.out.println("");
        NodoActual = NodoActual.derecha;
        
        }
        
    }
    
    public Nodo BuscarVehiculo(String placa){
        Nodo temp = primeraFila;
        while(temp !=null){
            
            if(temp.vehiculo.getPlaca().equals(placa)){
                return temp;
                
            }
            temp = temp.derecha;
        }
        return null;
    }
    
    public void EliminarVehiculo (String placa){
        
        if(primeraFila != null && primeraFila.vehiculo.getPlaca().equals(placa)){
            primeraFila =primeraFila.derecha;
            
        }else{
            Nodo nodoActual = primeraFila;
            while (nodoActual != null && nodoActual.derecha != null){
                if (nodoActual.derecha.vehiculo.getPlaca().equals(placa)){
                    nodoActual.derecha = nodoActual.derecha.derecha;
                    break;
                }
                nodoActual= nodoActual.derecha;
            }
        }
    }
    
}
