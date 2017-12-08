/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_gabriel_alvarado;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Gabriel Alvarado
 */
public class Casa extends Objetos{
  private String tiempo;
  private String area;
  private String instrucciones;
  private Date fecha;

    public Casa(String tiempo, String area, String instrucciones, Date fecha, Color color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.tiempo = tiempo;
        this.area = area;
        this.instrucciones = instrucciones;
        this.fecha = fecha;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Casa{" + "tiempo=" + tiempo + ", area=" + area + ", instrucciones=" + instrucciones + ", fecha=" + fecha + '}';
    }
  
  
}
