/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author a18adrianrr
 */
public class ModeloDatos {
    private ArrayList<String> listaPro;
    private ArrayList<String> listaProfesion;
    private ArrayList<Trabajador> listaTrabajadors;

    public ModeloDatos() {
        listaPro=new ArrayList<>();
        listaProfesion=new ArrayList<>();
        listaTrabajadors=new ArrayList<>();
    }

    public ArrayList<String> getListaPro() {
        return listaPro;
    }

    public void setListaPro(ArrayList<String> listaPro) {
        this.listaPro = listaPro;
    }

    public ArrayList<String> getListaProfesion() {
        return listaProfesion;
    }

    public void setListaProfesion(ArrayList<String> listaProfesion) {
        this.listaProfesion = listaProfesion;
    }

    public ArrayList<Trabajador> getListaTrabajadors() {
        return listaTrabajadors;
    }

    public void setListaTrabajadors(ArrayList<Trabajador> listaTrabajadors) {
        this.listaTrabajadors = listaTrabajadors;
    }
    
    public boolean añadirProvincias(String provincias){
        if (!provincias.contains(provincias)) {
          listaPro.add(provincias);
          return true;
        }
        return false;
    }
    
    public boolean añadirProfesion(String profesion){
        if (!profesion.contains(profesion)) {
          listaProfesion.add(profesion);
          return true;
        }
        return false;
    }
    public boolean añadirTrabajador(Trabajador trabajador){
        for (Trabajador trabajador1 : listaTrabajadors) {
            if (trabajador1.getDNI().equals(trabajador.getDNI())) {
                return false;
            }
        }
       listaTrabajadors.add(trabajador);
       return true;
    }
    
    public boolean eliminarProvincia(String provincia){
        for (Trabajador trabajador : listaTrabajadors) {
            if (trabajador.getProvincia().equals(provincia)) {
                return false;
            }
        }
        return listaPro.remove(provincia);
    }
    
    public boolean eliminarProfesion(String profesion){
        for (Trabajador trabajador : listaTrabajadors) {
            if (trabajador.getProfesion().equals(profesion)) {
                return false;
            }
        }
        return listaProfesion.remove(profesion);
    }
}
