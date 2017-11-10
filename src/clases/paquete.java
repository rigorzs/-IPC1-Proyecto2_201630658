/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Juan RigobertoZuñiga
 */
public class paquete {
    public String codigo;
    public String tipo;
    public String clasificacion;
    public String cantidad;
    public String transporte;
    public String hospedage;
    public String codcreucero;
    public String codrenta;
    public String codestino;
    public String codlugar;
    public String costo;

    public paquete() {
         this.codigo ="";
        this.tipo = "";
        this.clasificacion = "";
        this.cantidad = "";
        this.transporte = "";
        this.hospedage = "";
        this.codcreucero = "";
        this.codrenta = "";
        this.codestino = "";
        this.codlugar = "";
        this.costo = "";
    }
    public paquete(String codigo, String tipo, String clasificacion, String cantidad, String transporte, String hospedage, String codcreucero, String codrenta, String codestino, String codlugar, String costo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.clasificacion = clasificacion;
        this.cantidad = cantidad;
        this.transporte = transporte;
        this.hospedage = hospedage;
        this.codcreucero = codcreucero;
        this.codrenta = codrenta;
        this.codestino = codestino;
        this.codlugar = codlugar;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getHospedage() {
        return hospedage;
    }

    public void setHospedage(String hospedage) {
        this.hospedage = hospedage;
    }

    public String getCodcreucero() {
        return codcreucero;
    }

    public void setCodcreucero(String codcreucero) {
        this.codcreucero = codcreucero;
    }

    public String getCodrenta() {
        return codrenta;
    }

    public void setCodrenta(String codrenta) {
        this.codrenta = codrenta;
    }

    public String getCodestino() {
        return codestino;
    }

    public void setCodestino(String codestino) {
        this.codestino = codestino;
    }

    public String getCodlugar() {
        return codlugar;
    }

    public void setCodlugar(String codlugar) {
        this.codlugar = codlugar;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
}
