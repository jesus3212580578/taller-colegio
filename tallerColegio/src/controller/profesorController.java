/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import modelo.clasePersona;
import modelo.consultaProfesor;

/**
 *
 * @author Ambiente 209-2
 */
public class profesorController {

    public boolean agregarProfesor(String identificacion, String nombre, String apellido, int edad) {
        consultaProfesor agregar = new consultaProfesor();
        return agregar.agregarProfesor(identificacion, nombre, apellido, edad);
    }

    public boolean actualizarProfesor(String identificacion, String nombre, String apellido, int edad) {
        consultaProfesor actualizar = new consultaProfesor();
        return actualizar.actualizarProfesor(identificacion, nombre, apellido, edad);
    }

    public boolean eliminarProfesor(String identificacion) {
        consultaProfesor eliminar = new consultaProfesor();
        return eliminar.eliminarProfesor(identificacion);
    }

    public List<clasePersona> listaProfesor() {
        consultaProfesor listar = new consultaProfesor();
        return listar.person();
    }

    public clasePersona consultarProfesor(String identificacion) {
        consultaProfesor buscar = new consultaProfesor();
        return buscar.consultaProfesor(identificacion);
    }

}
