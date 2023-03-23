/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus tamayo
 */
public class consultaCurso {

    public static List<cursos> ListaCursos = new ArrayList<>();

    public boolean agregarCurso(int codigo, String nombre) {
        cursos curso = new cursos(nombre,codigo);
        ListaCursos.add(curso);
        return true;
    }

    public boolean editarCurso(int codigo, String nombre) {
        cursos curso = null;
        int indice = -1;
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                curso = ListaCursos.get(i);
                indice = i;
            }
        }
        if (curso != null) {
            curso.setCodigo(codigo);
            curso.setNombre(nombre);
            ListaCursos.set(indice, curso);
            return true;
        } else {
            return false;
        }
    }
    public boolean eliminarCurso (int codigo){
       for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo){
                ListaCursos.remove(i);
                return true;
            } 
    }
       return false;
    }
    public List<cursos> consultarListaCursos(){
        return ListaCursos;
    }
    public cursos consultarCursosPorcodigo (int codigo){
        for (int i = 0;i< ListaCursos.size();i++){
            if(ListaCursos.get(i).getCodigo()==codigo){
                return ListaCursos.get(i);
            }
        }
        return null;
    }


}