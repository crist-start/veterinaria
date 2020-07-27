/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Time;
import java.sql.Timestamp;


/**
 *
 * @author crist
 */

public class Cita {

    private Integer idCita;

    private Timestamp horaInicio;

    private Timestamp horaFin;
    
    private String usuario4;
    
    private Integer id_servicio2;

    public Cita() {
    }

    public Cita(Integer idCita, Timestamp horaInicio, Timestamp horaFin, String usuario4, Integer id_servicio2) {
        this.idCita = idCita;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.usuario4 = usuario4;
        this.id_servicio2 = id_servicio2;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    public String getUsuario4() {
        return usuario4;
    }

    public void setUsuario4(String usuario4) {
        this.usuario4 = usuario4;
    }

    public Integer getId_servicio2() {
        return id_servicio2;
    }

    public void setId_servicio2(Integer id_servicio2) {
        this.id_servicio2 = id_servicio2;
    }

    @Override
    public String toString() {
        return idCita.toString();
    }
}