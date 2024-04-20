/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2.proga;

import java.util.Scanner;

/**
 *
 * @author Marlon Ramirez 
 */
public class Proyecto2Proga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner (System.in);
        
        MatrizEnlazada matriz = new MatrizEnlazada();
        int option;
        do {
            System.out.println("------BIENDO AL PROGRAMA DE ESTACIONAMIENTO DE VEHICULOS----- ");
            System.out.println("MENU PRINCIPAL");
            System.out.println("INGRESAR LOS DATOS DE UN NUEVO VEHICULO OPCION 1");
            System.out.println("MOSTRAS LOS VEHICULOS INGRESADOS OPCION 2 ");
            System.out.println("BUSCAR UN VEHICULO POR PLACA OPCION 3");
            System.out.println("ELMINAR UN VEHICULO POR PLACA OPCION 4");
            System.out.println("DESEA SALIR DEL PROGRAMA OPCION 5");
            System.out.println("INGRESE UNA OPCION");            
            option = entrada.nextInt();
            entrada.nextLine();
            
            switch (option){
               
                case 1:
                    System.out.println("------INGRESE LOS DATOS DEL VEHICULO------  ");
                    System.out.println("INGRESE LA PLACA DEL VEHICULO EN FORMATO 'XXX000' ");
                    String placa = entrada.nextLine();

                    System.out.println("INGRESE EL COLOR DEL VEHICULO ");
                    String color = entrada.nextLine();

                    System.out.println("INGRESE LA LINEA O MARCA DEL VEHICULO ");
                    String linea = entrada.nextLine();

                    System.out.println("INGRESE EL MODELO DEL VEHICULO EN FORMATO 0000 ");        
                    int modelo = entrada.nextInt();
                    entrada.nextLine();
                    
                            
                    System.out.println("INGRESE EL NOMBRE DEL PROPIETARIO");
                    String propietaro = entrada.nextLine();

                    
                    matriz.agregarvehiculo(new Vehiculo(placa,color,linea,modelo,propietaro));
                    System.out.println("VEHICULO INGRESADO CORRECTAMENTE");
                    break;   
                case 2:
                    System.out.println("LOS VEHICULOS EN LA MATRIZ SON: ");
                    matriz.imprimirmatriz();
                    break;
                case 3:
                    System.out.println("INGRESE LA PLACA DEL VEHICULO A BUSCAR ");
                    String placaBuscar = entrada.nextLine();
                    Nodo nodoEncontrado = matriz.BuscarVehiculo(placaBuscar);
                    if(nodoEncontrado !=null){
                        Vehiculo vehiculoEncontrado = nodoEncontrado.vehiculo;
                        System.out.println("Vehiculo encontrado");
                        System.out.println("LA PLACA DEL VEHICULO ES; "+ vehiculoEncontrado.getPlaca());
                        System.out.println("EL COLOR DEL VEHICULO ES; "+ vehiculoEncontrado.getColor());
                        System.out.println("LA LINEA O MARCA DEL VEHICULO ES; "+ vehiculoEncontrado.getLinea());
                        System.out.println("EL MODELO DEL VEHICULO ES; "+ vehiculoEncontrado.getModelo());
                        System.out.println("EL PROPIETARIO DEL VEHICULO ES; "+ vehiculoEncontrado.getPropietario());
                    }else{
                        System.out.println("el vehiculo "+placaBuscar+" no fue encontrada en la matriz ");
                    }
                    break;
                case 4:
                    System.out.println("INGRESE LA PLACA DEL VEHICULO A ELIMINAR");
                    String VehiculoEliminar = entrada.nextLine();
                    System.out.println("EL VEHICULO SE ELIMINO CORRECTAMENTE");
                    matriz.EliminarVehiculo(VehiculoEliminar);                   
                    break;
                case 5:
                    System.out.println("USTED SALIO DEL PROGRAMA!! ");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            
            
        }while(option != 5);        
        
    }


    
}
