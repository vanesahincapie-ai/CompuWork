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

public class ReporteDesempeño {
    public static void generarReporteIndividual(Empleado e) {
        System.out.println(e.generarReporteDesempeño());
    }

    public static void generarReporteDepartamento(Departamento d) {
        System.out.println("=== Reporte del Departamento: " + d.getNombre() + " ===");
        for (Empleado e : d.getEmpleados()) {
            System.out.println(e.generarReporteDesempeño());
        }
    }
}