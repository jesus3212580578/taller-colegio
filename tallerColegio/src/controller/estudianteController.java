/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import modelo.clasePersona;
import modelo.consultaEstudiante;

/**
 *
 * @author Ambiente 209-2
 */
public class estudianteController {

    public boolean agregarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        consultaEstudiante agregar = new consultaEstudiante();
        return agregar.agregarEstudiante(identificacion, nombre, apellido, edad);
    }

    public boolean actualizarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        consultaEstudiante actualizar = new consultaEstudiante();
        return actualizar.actualizarEstudiante(identificacion, nombre, apellido, edad);
    }
    
     public boolean eliminarEstudiante(String identificacion) {
        consultaEstudiante eliminar = new consultaEstudiante();
        return eliminar.eliminarEstudiante(identificacion);
     }
     
  public List<clasePersona>listaEstudiantes(){
      consultaEstudiante listar= new consultaEstudiante();
      return listar.person();
  }   
}
     
