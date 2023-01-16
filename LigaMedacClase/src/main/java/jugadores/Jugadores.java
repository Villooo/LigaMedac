/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

import java.util.ArrayList;

/**
 *
 * @author Víctor
 */
public class Jugadores {
    
    
//Declaración de las variables
    private String Nombre ;
    private double Peso;
    private int Edad;

    private ArrayList<demarcacion> Demarcacion_Jugador;
    
    
//Contructor

    public Jugadores(String Nombre, double Peso, int Edad, ArrayList<demarcacion> Demarcacion_Jugador) {
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Edad = Edad;
        this.Demarcacion_Jugador = Demarcacion_Jugador;
    }
    
    
    
//Getters and setters   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public ArrayList<demarcacion> getDemarcacion_Jugador() {
        return Demarcacion_Jugador;
    }

    public void setDemarcacion_Jugador(ArrayList<demarcacion> Demarcacion_Jugador) {
        this.Demarcacion_Jugador = Demarcacion_Jugador;
    }
 
    
    
    
    
    
    
    
    
    
    
    
}
