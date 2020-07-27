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

public class Municipio{

    private Integer cMnpio;

    private int nMnpio;

    private String mnpio;

    private Integer estado;

    public Municipio() {
    }

    public Municipio(Integer cMnpio) {
        this.cMnpio = cMnpio;
    }

    public Municipio(Integer cMnpio, int nMnpio, String mnpio, Integer estado) {
        this.cMnpio = cMnpio;
        this.nMnpio = nMnpio;
        this.mnpio = mnpio;
        this.estado = estado;
    }

    

    public Integer getCMnpio() {
        return cMnpio;
    }

    public void setCMnpio(Integer cMnpio) {
        this.cMnpio = cMnpio;
    }

    public int getNMnpio() {
        return nMnpio;
    }

    public void setNMnpio(int nMnpio) {
        this.nMnpio = nMnpio;
    }

    public String getMnpio() {
        return mnpio;
    }

    public void setMnpio(String mnpio) {
        this.mnpio = mnpio;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return mnpio;
    }
    
}
