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
    private String beneficios;
    private Date fechaFinContrato;

    public EmpleadoPermanente(int idEmpleado, String nombre, String apellido, String cargo, double salario, Date fechaIngreso, String beneficios, Date fechaFinContrato) {
        super(idEmpleado, nombre, apellido, cargo, salario, fechaIngreso);
        this.beneficios = beneficios;
        this.fechaFinContrato  = fechaFinContrato;
    }
    
     public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
     
    @Override
    public String toString() {
        return super.toString() +
               ", Tipo: Permanente" +
               ", Beneficios: " + beneficios +
               ", Fecha fin contrato: " + fechaFinContrato;
    }

    @Override
    public String generarReporteDesempeño() {
        return "Reporte de " + getNombre() + " " + getApellido() +
               " (Permanente): Desepeño excelente. Beneficios:" + beneficios;
    }}