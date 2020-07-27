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
public class Telefono{

    private Integer idTel;

    private String tipo;

    private String numero;

    private String cliente;

    public Telefono() {
    }

    public Telefono(Integer idTel) {
        this.idTel = idTel;
    }

    public Telefono(Integer idTel, String tipo, String numero, String cliente) {
        this.idTel = idTel;
        this.tipo = tipo;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Integer getIdTel() {
        return idTel;
    }

    public void setIdTel(Integer idTel) {
        this.idTel = idTel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return tipo+":"+numero;
    }
    
}
