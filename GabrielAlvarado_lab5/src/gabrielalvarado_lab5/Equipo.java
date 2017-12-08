/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielalvarado_lab5;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
public class Equipo {
  private  String nombre;
  private  int copas;
  private  String estadio;
  private int presupuesto;
  private ArrayList<Jugador> ListJugador = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, int copas, String estadio, int presupuesto) {
        this.nombre = nombre;
        this.copas = copas;
        this.estadio = estadio;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getListJugador() {
        return ListJugador;
    }

    public void setListJugador(Jugador e) {
        ListJugador.add(e);
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", copas=" + copas + '}';
    }


   
 
   
    
}
