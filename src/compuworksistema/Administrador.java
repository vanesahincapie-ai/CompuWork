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

public class Administrador {
    private int idAdministrador;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    
    public Administrador(int idAdministrador, String nombre, String apellido, String usuario, String contraseña){
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
      public int getIdAdministrador() {
        return idAdministrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void registrarEmpleado(Departamento d, Empleado e) throws Exception {
        d.agregarEmpleado(e);
    }

    public void eliminarEmpleado(Departamento d, Empleado e) throws Exception {
        d.eliminarEmpleado(e);
    }

    public void generarReporteIndividual(Empleado e) {
        ReporteDesempeño.generarReporteIndividual(e);
    }

    public void generarReporteDepartamento(Departamento d) {
        ReporteDesempeño.generarReporteDepartamento(d);
    }
    
    @Override
    public String toString() {
        return "Administrador [ID: " + idAdministrador +
               ", Usuario: " + usuario +
               ", Nombre: " + nombre + " " + apellido + "]";
    }

}
