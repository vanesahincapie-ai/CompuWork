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

public class EmpleadoPermanente extends Empleado {
    private Date fechaFinContrato;

    public EmpleadoPermanente(String nombre, String apellido, String cargo, double salario, Date fechaIngreso, String beneficios, Date fechaFinContrato) {
        super(nombre, apellido, cargo, salario, fechaIngreso);
        setBeneficios(beneficios);
        this.fechaFinContrato = fechaFinContrato;
    }

    public Date getFechaFinContrato() { return fechaFinContrato; }
    public void setFechaFinContrato(Date fechaFinContrato) { this.fechaFinContrato = fechaFinContrato; }

    @Override
    public String toString() {
        return super.toString() +
               ", Tipo: Permanente" +
               ", Beneficios: " + getBeneficios() +
               ", Fecha fin contrato: " + fechaFinContrato;
    }

    @Override
    public String generarReporteDesempeño() {
        return "Reporte de " + getNombre() + " " + getApellido() +
               " (Permanente): Desempeño excelente. Beneficios: " + getBeneficios();
    }
}


