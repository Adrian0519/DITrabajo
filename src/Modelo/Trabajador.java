/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author a18adrianrr
 */
public class Trabajador {
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String provincia;
    private String profesion;

    public Trabajador(String DNI, String nombre, String apellido1, String apellido2, String provincia, String profesion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.provincia = provincia;
        this.profesion = profesion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getProfesion() {
        return profesion;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", provincia=" + provincia + ", profesion=" + profesion + '}';
    }
    
    
}
