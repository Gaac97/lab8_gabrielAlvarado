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
public class Persona {
    private String nombre;
    private String Edad;
    private String id;
    private String sexo;
    private String Estado;
    private ArrayList<Mensajes>ListMensaje = new ArrayList();
    private String usuario;
    private String contra;

    public Persona() {
    }

    public Persona(String nombre, String Edad, String id, String sexo, String Estado, String usuario, String contra) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.id = id;
        this.sexo = sexo;
        this.Estado = Estado;
        this.usuario = usuario;
        this.contra = contra;
    }
    

    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public ArrayList<Mensajes> getListMensaje() {
        return ListMensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

 
    

    public void setListMensaje(ArrayList<Mensajes> ListMensaje) {
        this.ListMensaje = ListMensaje;
    }

    @Override
    public String toString() {
        return nombre;
    }


  
    
     
}
