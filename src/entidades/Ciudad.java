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

public class Ciudad {

    private static final long serialVersionUID = 1L;

    private Integer cCiudad;

    private Integer nCiudad;

    private String ciudad;

    private Integer municipio;

    public Ciudad() {
    }

    public Ciudad(Integer cCiudad) {
        this.cCiudad = cCiudad;
    }

    public Ciudad(Integer cCiudad, Integer nCiudad, String ciudad, Integer municipio) {
        this.cCiudad = cCiudad;
        this.nCiudad = nCiudad;
        this.ciudad = ciudad;
        this.municipio = municipio;
    }

    public Integer getCCiudad() {
        return cCiudad;
    }

    public void setCCiudad(Integer cCiudad) {
        this.cCiudad = cCiudad;
    }

    public Integer getNCiudad() {
        return nCiudad;
    }

    public void setNCiudad(Integer nCiudad) {
        this.nCiudad = nCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return ciudad;
    }
    
}
