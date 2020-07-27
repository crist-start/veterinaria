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

public class TipoColonia{

    private Integer cTipo;

    private String tipo;

    public TipoColonia() {
    }

    public TipoColonia(Integer cTipo) {
        this.cTipo = cTipo;
    }

    public TipoColonia(Integer cTipo, String tipo) {
        this.cTipo = cTipo;
        this.tipo = tipo;
    }

    public Integer getCTipo() {
        return cTipo;
    }

    public void setCTipo(Integer cTipo) {
        this.cTipo = cTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
    
}
