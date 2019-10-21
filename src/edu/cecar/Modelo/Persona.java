package edu.cecar.Modelo;

/**
 *
 * Clase: Persona
 * 
 * @version: 0.1
 *  
 * @since: 21/10/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Osnayder conde Rodriguez, Jader Arcia Baldovino, Calor Beltran Guzman
 * 
 * Copyright: CECAR
 */

public class Persona {

    private String identificacion;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    
    public Persona() {
    }

    public Persona(String identificacion, String nombres, String apellidos, String fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
