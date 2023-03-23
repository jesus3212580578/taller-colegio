/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus tamayo
 */
public class consultaEstudiante {

    private List<Integer> cursosMatriculados;
    private static List<clasePersona> listaEstudiantes= new ArrayList<>();

    public boolean agregarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        try {
            clasePersona wanheda = new clasePersona();
            wanheda.setIdentificacion(identificacion);
            wanheda.setNombre(nombre);
            wanheda.setApellido(apellido);
            wanheda.setEdad(edad);
            listaEstudiantes.add(wanheda);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
    public boolean actualizarEstudiante(String identificacion, String nombre, String apellido, int edad){
       clasePersona  per =new clasePersona();
       //-1 para que busque la persona en la lista de estudiantes
       int indice=-1;
       for(int t=0;t<listaEstudiantes.size(); t++){
           if (listaEstudiantes.get(t).getIdentificacion().equals(identificacion)){
               per = listaEstudiantes.get(t);
               indice = t;
           }
       }
       if(indice > -1){
           per.setIdentificacion(identificacion);
           per.setNombre(nombre);
           per.setApellido(apellido);
           per.setEdad(edad);
           listaEstudiantes.set(indice, per);
           return true;
       }else{
           System.out.println("No se encontro el estudiante");
       }
       return false;
    }
    
    public boolean eliminarEstudiante(String identificacion){
    for(int i =0; i < listaEstudiantes.size();i++){
        if(listaEstudiantes.get(i).getIdentificacion().equals(identificacion)){
            listaEstudiantes.remove(i);
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
    return listaEstudiantes;
}
}
