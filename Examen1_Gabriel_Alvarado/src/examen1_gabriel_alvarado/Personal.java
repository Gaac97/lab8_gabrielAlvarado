/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_gabriel_alvarado;

import java.util.Date;

/**
 *
 * @author Gabriel Alvarado
 */
public class Personal extends Persona{
    private String ocupacion;
    private String horarioI;
    private String horarioT;
    private Date Tiempo;
    private int sueldo;

    public Personal() {
       
    }
    

    public Personal(String ocupacion, String horarioI, String horarioT, Date Tiempo, int sueldo, String nombre, String Edad, String id, String sexo, String Estado, String usuario, String contra) {
        super(nombre, Edad, id, sexo, Estado, usuario, contra);
        this.ocupacion = ocupacion;
        this.horarioI = horarioI;
        this.horarioT = horarioT;
        this.Tiempo = Tiempo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorarioI() {
        return horarioI;
    }

    public void setHorarioI(String horarioI) {
        this.horarioI = horarioI;
    }

    public String getHorarioT() {
        return horarioT;
    }

    public void setHorarioT(String horarioT) {
        this.horarioT = horarioT;
    }

    public Date getTiempo() {
        return Tiempo;
    }

    public void setTiempo(Date Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return ocupacion ;
    }

    
    
    
}
