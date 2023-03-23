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
public class consultaProfesor {
    private List<Integer> cursosMatriculados;
    private static List<clasePersona> listarProfesor= new ArrayList<>();

    public static List<clasePersona> tableProfesor = new ArrayList<>();

    public boolean agregarProfesor(String identificacion, String nombre, String apellido, int edad) {
        boolean existe = true;
        for (clasePersona P : tableProfesor) {
            if (P.getIdentificacion().equals(identificacion)) {
                existe = false;
            }
        }
        if (existe) {
            try {
                clasePersona P = new clasePersona();
                P.setIdentificacion(identificacion);
                P.setNombre(nombre);
                P.setApellido(apellido);
                P.setEdad(edad);
                tableProfesor.add(P);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return existe;
    }

    public clasePersona consultaProfesor(String identificacion) {
        for (int i = 0; i < tableProfesor.size(); i++) {
            if (tableProfesor.get(i).getIdentificacion().equals(identificacion)) {
                return tableProfesor.get(i);
            }

        }
        return null;
    }

    public boolean actualizarProfesor(String identificacion, String nombre, String apellido, int edad) {
        int indice = -1;
        clasePersona per = new clasePersona();
        for (int i = 0; i < tableProfesor.size(); i++) {
            if (tableProfesor.get(i).getIdentificacion().equals(identificacion)){
                per = tableProfesor.get(i);
                indice = i;
            }
        }
        if (indice > -1){
            per.setIdentificacion(identificacion);
            per.setNombre(nombre);
            per.setApellido(apellido);
            per.setEdad(edad);
            tableProfesor.set(indice, per);
            return true;
        }else{
            return false;
        }
    }
    public boolean eliminarProfesor (String idenificacion){
        for (int i=0; i < tableProfesor.size(); i++){
        if(tableProfesor.get(i).getIdentificacion().equals(idenificacion)){
            tableProfesor.remove(i);
            return true;
        }
    }
        return false;
    }
  public boolean matricularCurso(int codigo, claseEstudiante estudiante) {
        try {
            cursosMatriculados = estudiante.getcursosMatriculados();
            // si se encuentra el curso mo hace el proceso
            for (int i = 0; i < cursosMatriculados.size(); i++) {
                if (cursosMatriculados.get(i) == codigo) {
                    return false;
                }
            }

//procede a matricular
            cursosMatriculados.add(codigo);
            estudiante.setCursosMatriculados(cursosMatriculados);
            return true;
        } catch (Exception e) {
            // si tiene error
            return false;
        }

    }

    public boolean editarMatricula(int codigoAnterior, int codigoActual, claseEstudiante estudiante) {
        try {
            cursosMatriculados = estudiante.getcursosMatriculados();
            for (int i = 0; i < cursosMatriculados.size(); i++) {
                if (cursosMatriculados.get(i) == codigoAnterior) {
                    cursosMatriculados.set(i, codigoActual);
                    return true;
                }

            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean eliminarMatricula(int codigo, claseEstudiante estudiante) {
        try {
            cursosMatriculados = estudiante.getcursosMatriculados();
            for (int i = 0; i < cursosMatriculados.size(); i++) {
                if (cursosMatriculados.get(i) == codigo) {
                    cursosMatriculados.remove(i);
                    return true;
                }

            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
public List<clasePersona> person(){
    return tableProfesor;
}
}