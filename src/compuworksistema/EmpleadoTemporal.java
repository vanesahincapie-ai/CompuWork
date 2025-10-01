/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworksistema;

/**
 *
 * @author luis.cardona
 */
//Vanesa Hincapié Martínez 
//Marisol Guarin Escobar 

import java.util.Date;

public class EmpleadoTemporal extends Empleado {
    private String beneficio;
    private boolean contratoDefinido;
    

    public EmpleadoTemporal(int idEmpleado, String nombre, String apellido,String cargo, double salario, Date fechaIngreso, String beneficio, boolean contratoDefinido) {
        super(idEmpleado,nombre, apellido, cargo, salario, fechaIngreso);
        this.beneficio = beneficio; 
        this.contratoDefinido = contratoDefinido;
    }
    
    public String getBeneficios() {
        return beneficio;
    }

    public void setBeneficios(String beneficios) {
        this.beneficio = beneficios;
    }

    public boolean isContratoDefinido() {
        return contratoDefinido;
    }

    public void setContratoDefinido(boolean contratoDefinido) {
        this.contratoDefinido = contratoDefinido;
    } 
   
    @Override
    public String toString() {
        return super.toString() +
               ", Tipo: Temporal" +
               ", Beneficios: " + beneficio +
               ", Contrato definido: " + contratoDefinido;
    }

    @Override
    public String generarReporteDesempeño() {
        return "Reporte de " + getNombre() + " " + getApellido() +
               " (Temporal): Desempeño satisfactorio. Beneficios: " + beneficio +
               ", Contrato definido: " + (contratoDefinido ? "Sí" : "No");
    } 
}