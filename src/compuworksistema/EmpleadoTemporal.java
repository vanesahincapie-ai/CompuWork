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
    private boolean contratoDefinido;

    public EmpleadoTemporal(String nombre, String apellido, String cargo, double salario, Date fechaIngreso, String beneficios, boolean contratoDefinido) {
        super(nombre, apellido, cargo, salario, fechaIngreso);
        setBeneficios(beneficios);
        this.contratoDefinido = contratoDefinido;
    }

    public boolean isContratoDefinido() { return contratoDefinido; }
    public void setContratoDefinido(boolean contratoDefinido) { this.contratoDefinido = contratoDefinido; }

    @Override
    public String toString() {
        return super.toString() +
               ", Tipo: Temporal" +
               ", Beneficios: " + getBeneficios() +
               ", Contrato definido: " + contratoDefinido;
    }

    @Override
    public String generarReporteDesempeño() {
        return "Reporte de " + getNombre() + " " + getApellido() +
               " (Temporal): Desempeño satisfactorio. Beneficios: " + getBeneficios() +
               ", Contrato definido: " + (contratoDefinido ? "Sí" : "No");
    }
}
