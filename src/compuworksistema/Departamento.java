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
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String descripcion;  // nuevo atributo
    private List<Empleado> empleados;  // lista de empleados

    public Departamento(String nombreDepartamento, String descripcion) {
        this.nombre = nombreDepartamento;
        this.descripcion = descripcion;
        this.empleados = new ArrayList<>();
    }

    

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Empleado> getEmpleadosAsignados() {  // para compatibilidad con tu reporte
        return empleados;
    }

    public void setEmpleadosAsignados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    // ===== CRUD con Excepciones =====
    public void agregarEmpleado(Empleado nuevoEmpleado) throws Exception {
        if (empleados.contains(nuevoEmpleado)) {
            throw new Exception("El empleado ya está en este departamento.");
        }
        empleados.add(nuevoEmpleado);
    }

    public Empleado buscarEmpleado(Empleado empleadoBuscado) throws Exception {
        for (Empleado e : empleados) {
            if (e.equals(empleadoBuscado)) {
                return e;
            }
        }
        throw new Exception("Empleado no encontrado en este departamento.");
    }

    public void eliminarEmpleado(Empleado empleadoAEliminar) throws Exception {
        if (!empleados.remove(empleadoAEliminar)) {
            throw new Exception("No se pudo eliminar: el empleado no existe en este departamento.");
        }
    }

    public String mostrarEmpleados() throws Exception {
        if (empleados.isEmpty()) {
            throw new Exception("No hay empleados en este departamento.");
        }

        StringBuilder lista = new StringBuilder("Lista de empleados:\n");
        for (Empleado e : empleados) {
            lista.append(e.toString()).append("\n");
        }
        return lista.toString();
    }
}

