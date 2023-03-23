/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ambiente 209-2
 */
public class clasePersona {
    
 
    private String identificacion;
    private String nombre;
    private String apellido;
    private int edad;
 
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  /*public static void registarPersona(String apellido,
          String nombre,
          String identificacion,
          int edad){
      
  }*/
    public boolean registrarPersona(String identificacion,String nombre, String apellido, int edad){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        return true;
        // verdadero si funciona
        
    }
 /*public clasePersona(){
        
    }*/
}
