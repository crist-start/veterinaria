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

public class Colonia{

    private Integer cColonia;

    private int nColonia;

    private String colonia;

    private int dCodigo;

    private Integer ciudad;

    private Integer tipoColonia;

    public Colonia() {
    }

    public Colonia(Integer cColonia) {
        this.cColonia = cColonia;
    }

    public Colonia(Integer cColonia, int nColonia, String colonia, int dCodigo, Integer ciudad, Integer tipoColonia) {
        this.cColonia = cColonia;
        this.nColonia = nColonia;
        this.colonia = colonia;
        this.dCodigo = dCodigo;
        this.ciudad = ciudad;
        this.tipoColonia = tipoColonia;
    }

    public Integer getCColonia() {
        return cColonia;
    }

    public void setCColonia(Integer cColonia) {
        this.cColonia = cColonia;
    }

    public int getNColonia() {
        return nColonia;
    }

    public void setNColonia(int nColonia) {
        this.nColonia = nColonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getDCodigo() {
        return dCodigo;
    }

    public void setDCodigo(int dCodigo) {
        this.dCodigo = dCodigo;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getTipoColonia() {
        return tipoColonia;
    }

    public void setTipoColonia(Integer tipoColonia) {
        this.tipoColonia = tipoColonia;
    }

    @Override
    public String toString() {
        return colonia;
    }
    
}
