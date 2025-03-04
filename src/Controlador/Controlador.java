/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloDatos;
import Modelo.Trabajador;
import adrianrodriguezroqueiro.AltaTrabajador;
import adrianrodriguezroqueiro.Dialogos;
import adrianrodriguezroqueiro.TrabajadoresDisponibles;
import adrianrodriguezroqueiro.gestionProfesion;
import adrianrodriguezroqueiro.gestionProvincias;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author a18adrianrr
 */
public class Controlador {
    
    private ModeloDatos modeloDatos;
    private Dialogos dialogos;

    public Controlador(){
        this(false);
    }
    
    public Controlador (boolean showDialog){
        modeloDatos=new ModeloDatos();
        if (showDialog) {
            dialogos=new Dialogos(this);
            dialogos.setVisible(true);
        }
    }
    
    public void abrirVentanaGestionProvincia(){
        gestionProvincias gestionprovincias=new gestionProvincias(this);
        gestionprovincias.setVisible(true);
    }
    
    public void abrirVentanaGestionProfesion(){
        gestionProfesion gestionprofesion=new gestionProfesion(this);
        gestionprofesion.setVisible(true);
    }
    
     public void abrirtrabajadoresDisponibles(){
         TrabajadoresDisponibles trabajadoresDisponibles=new TrabajadoresDisponibles();
        trabajadoresDisponibles.setVisible(true);
    }
     
     public void abrirAltaTrabajador(){
         AltaTrabajador altatrabajador=new AltaTrabajador(this);
         altatrabajador.setVisible(true);
     }
    public List<String> getProfesion(){
      return modeloDatos.getListaProfesion();
    }
    
    public List<String>getProvincias(){
        return modeloDatos.getListaPro();
    }
    
    public void añadirProvincia(String provincia){
        if (modeloDatos.añadirProvincias(provincia)) {
            JOptionPane.showMessageDialog(null, "se agrego correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Provincia ya existe");
        }
    }
    
    public void añadirProfesion(String profesion){
        if (modeloDatos.añadirProfesion(profesion)) {
            JOptionPane.showMessageDialog(null, "Se añadio la profesion de forma exitosa");
        }else{
            JOptionPane.showMessageDialog(null, "Profesion ya existe");
        }
    }
    
    public void añadirTrabajador(String dni,String nombre, String apellido1, String apellido2,String provincia, String profesion){
        Trabajador trabajador=new Trabajador(dni, nombre, apellido1, apellido2, provincia, profesion);
        if (modeloDatos.añadirTrabajador(trabajador)) {
            JOptionPane.showMessageDialog(null, "Se agrego al empleado");
        }else{
            JOptionPane.showMessageDialog(null, "El empleado no se puede agregar");
        }
    }
    
    public void eliminarProfesion(String profesion){
        if (modeloDatos.eliminarProfesion(profesion)) {
            JOptionPane.showMessageDialog(null, "La profesion fue eliminada");
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la profesion");
        }
    }
    
    public void eliminarProvincia(String provincia){
        if (modeloDatos.eliminarProvincia(provincia)) {
            JOptionPane.showMessageDialog(null, "Se elimino la provincia");
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la provincia");
        }
    }
}
