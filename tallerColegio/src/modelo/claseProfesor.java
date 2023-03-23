/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ambiente 209-2
 */
public class claseProfesor extends clasePersona {
    
       
    public claseProfesor(String identificacion, String nombre, String apellido, String edad) {
       this.setIdentificacion(identificacion);
        this.setNombre (nombre);
        this.setApellido(apellido);
       /* this.setEdad(edad);*/
    
}


    public static List<cursos> cursosImparte = new ArrayList<>();

    public boolean agregarCursos(int codigo) {
        return true;
    }

    public boolean editarCursos(int codigo) {
        return true;
    }

    public boolean eliminarCursos(int codigo) {

        for (cursos curso : cursosImparte) {
            if (curso.getCodigo() == codigo) {
                cursosImparte.remove(curso);
                return true;
            }
        }
        return false;
    }
}
