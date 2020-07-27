/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


/**
 *
 * @author crist
 */

public class Estado{

    private Integer cEstado;

    private String estado;


    public Estado() {
    }

    public Estado(Integer cEstado) {
        this.cEstado = cEstado;
    }

    public Estado(Integer cEstado, String estado) {
        this.cEstado = cEstado;
        this.estado = estado;
    }

    public Integer getCEstado() {
        return cEstado;
    }

    public void setCEstado(Integer cEstado) {
        this.cEstado = cEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado;
    }
    
}
