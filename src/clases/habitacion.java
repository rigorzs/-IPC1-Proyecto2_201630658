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
public class habitacion {
    public String codigo;
    public String numerohabiacion;
    public String codreservacion;
    public String cantidadhab;
    public String costohab;
    public String clase;
    public habitacion(String codigo, String numerohabiacion, String codreservacion, String cantidadhab, String costohab, String clase) {
        this.codigo = codigo;
        this.numerohabiacion = numerohabiacion;
        this.codreservacion = codreservacion;
        this.cantidadhab = cantidadhab;
        this.costohab = costohab;
        this.clase = clase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumerohabiacion() {
        return numerohabiacion;
    }

    public void setNumerohabiacion(String numerohabiacion) {
        this.numerohabiacion = numerohabiacion;
    }

    public String getCodreservacion() {
        return codreservacion;
    }

    public void setCodreservacion(String codreservacion) {
        this.codreservacion = codreservacion;
    }

    public String getCantidadhab() {
        return cantidadhab;
    }

    public void setCantidadhab(String cantidadhab) {
        this.cantidadhab = cantidadhab;
    }

    public String getCostohab() {
        return costohab;
    }

    public void setCostohab(String costohab) {
        this.costohab = costohab;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
}
