/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_gabriel_alvarado;

import java.awt.Color;

/**
 *
 * @author Gabriel Alvarado
 */
public class Zapatos extends Objetos{
    private int talla;
    private String tipo;
    private String confort;

    public Zapatos(int talla, String tipo, String confort, Color color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.tipo = tipo;
        this.confort = confort;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConfort() {
        return confort;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos{"+talla + tipo +confort ;
    }


    
    
}
