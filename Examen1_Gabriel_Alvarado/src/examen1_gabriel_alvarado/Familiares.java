/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_gabriel_alvarado;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
public class Familiares extends Persona{
    private String rol;
    private String trabajo;
    private String altura;
    private int peso;
    private ArrayList<Objetos>ListObjetos = new ArrayList();

    public Familiares() {
    }

    
    public Familiares(String rol, String trabajo, String altura, int peso) {
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public Familiares(String rol, String trabajo, String altura, int peso, String nombre, String Edad, String id, String sexo, String Estado, String usuario, String contra) {
        super(nombre, Edad, id, sexo, Estado, usuario, contra);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

   

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Objetos> getListObjetos() {
        return ListObjetos;
    }

    public void setListObjetos(Objetos L ) {
        ListObjetos.add(L);
    }

    @Override
    public String toString() {
        return rol ;
    }

 


   

  

   
    
    
}
