/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielalvarado_lab5;

/**
 *
 * @author Gabriel Alvarado
 */
public class Jugador {
   private String nombre;
   private int precio ;
   private String posicion;
   private boolean disponibilidad;
   private String habilidad;
   private String tecnica;
   private int resistencia;

    public Jugador() {
    }

   
    public Jugador(String nombre, int precio, String posicion, boolean disponibilidad, String habilidad, String tecnica, int resistencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", precio=" + precio + ", posicion=" + posicion + ", disponibilidad=" + disponibilidad + '}';
    }

    
   
    
}
