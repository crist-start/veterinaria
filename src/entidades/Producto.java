/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author crist
 */

public class Producto implements Serializable {

    private Integer idProd;

    private String producto;

    private float precio;

    private int disponibles;

    public Producto() {
    }

    public Producto(Integer idProd) {
        this.idProd = idProd;
    }

    public Producto(Integer idProd, String producto, float precio, int disponibles) {
        this.idProd = idProd;
        this.producto = producto;
        this.precio = precio;
        this.disponibles = disponibles;
    }

    public Integer getIdProd() {
        return idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public String toString() {
        return producto;
    }
    
}
