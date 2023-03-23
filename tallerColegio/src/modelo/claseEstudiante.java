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
public class claseEstudiante extends clasePersona {
   //estudiante puede estar matriculado en uno o mas cursos
        private String cursos;

    
    public List<Integer> cursosMatriculados= new ArrayList<>();
    
    public List<Integer> getcursosMatriculados(){
        return cursosMatriculados;
    }
    
    
    
     public claseEstudiante(String identificacion, String nombre, String apellido, String edad) {
       this.setIdentificacion(identificacion);
        this.setNombre (nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    
}


    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public boolean matricularCurso(int codigo) {
try {
    for(int i=0;i<cursosMatriculados.size();i++){
        // si se encuentra el curso mo hace el proceso
        if (cursosMatriculados.get(i)==codigo){
            return false;
        }
    }
//procede a matricular
    
    cursosMatriculados.add(codigo);
    return true;
}catch (Exception e){
    // si tiene error
    return false;
}
    
}

    void setCursosMatriculados(List<Integer> cursosMatriculados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setEdad(String edad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
