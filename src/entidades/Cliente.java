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
public class Cliente {

    private String usuario;

    private String pswd;

    private String apellidoP;

    private String apellidoM;

    private String nombres;

    private String correo;

    private String calle;

    private String numExt;

    private String numInt;

    private String colonia;

    private int codPostal;

    private String ciudad;

    private String municipio;

    private String estado;

    private String genero;

    public Cliente() {
    }

    public Cliente(String usuario) {
        this.usuario = usuario;
    }

    public Cliente(String usuario, String pswd, String apellidoP, String apellidoM, String nombres, String correo, String calle, String numExt, String numInt, String colonia, int codPostal, String ciudad, String municipio, String estado, String genero) {
        this.usuario = usuario;
        this.pswd = pswd;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nombres = nombres;
        this.correo = correo;
        this.calle = calle;
        this.numExt = numExt;
        this.numInt = numInt;
        this.colonia = colonia;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.estado = estado;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return apellidoP + " " + apellidoM + " " + nombres;
    }
}
