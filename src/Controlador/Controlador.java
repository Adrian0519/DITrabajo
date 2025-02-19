/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloDatos;
import adrianrodriguezroqueiro.AltaTrabajador;
import adrianrodriguezroqueiro.Dialogos;
import adrianrodriguezroqueiro.TrabajadoresDisponibles;
import adrianrodriguezroqueiro.gestionProfesion;
import adrianrodriguezroqueiro.gestionProvincias;

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
        gestionProvincias gestionprovincias=new gestionProvincias();
        gestionprovincias.setVisible(true);
    }
    
    public void abrirVentanaGestionProfesion(){
        gestionProfesion gestionprofesion=new gestionProfesion();
        gestionprofesion.setVisible(true);
    }
    
     public void abrirtrabajadoresDisponibles(){
         TrabajadoresDisponibles trabajadoresDisponibles=new TrabajadoresDisponibles();
        trabajadoresDisponibles.setVisible(true);
    }
     
     public void abrirAltaTrabajador(){
         AltaTrabajador altatrabajador=new AltaTrabajador();
         altatrabajador.setVisible(true);
     }
    
    
}
