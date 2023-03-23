/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import modelo.consultaCurso;
import modelo.cursos;


/**
 *
 * @author jesus tamayo
 */
public class cursoController {
    

    public boolean agregarCurso(int codigo, String nombre) {
        consultaCurso CursoConsulta = new consultaCurso();
        return CursoConsulta.agregarCurso(codigo, nombre);
    }

    public boolean editarCurso(int codigo, String nombre) {
       consultaCurso CursoConsulta = new consultaCurso();
        return CursoConsulta.editarCurso(codigo, nombre);
    }

    public boolean eliminarCurso(int codigo) {
        consultaCurso CursoConsulta = new consultaCurso();
        return CursoConsulta.eliminarCurso(codigo);
    }

    public List<cursos> consultarListaCurso() {
        consultaCurso CursoConsulta = new consultaCurso();
        return CursoConsulta.consultarListaCursos();
    }

    public cursos consultarCursosPorCodigo(int codigo) {
        consultaCurso CursoConsulta = new consultaCurso();
        return CursoConsulta.consultarCursosPorcodigo(codigo);
    }
}
