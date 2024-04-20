/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.proga;

/**
 *
 * @author Marlon Ramirez
 */
public class Vehiculo {
    
    private String Placa;
    private String Color;
    private String Linea;
    private int Modelo;
    private String Propietario;

    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Color, String Linea, int Modelo, String Propietario) {
        this.Placa = Placa;
        this.Color = Color;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.Propietario = Propietario;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getColor() {
        return Color;
    }

    public String getLinea() {
        return Linea;
    }

    public int getModelo() {
        return Modelo;
    }

    public String getPropietario() {
        return Propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Placa=" + Placa + ", Color=" + Color + ", Linea=" + Linea + ", Modelo=" + Modelo + ", Propietario=" + Propietario + '}';
    }
    
    
    
    
  
}
