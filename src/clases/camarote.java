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
public class camarote {
    public String codigo;
    public String codreservacion;
    public String numerohab;
    public String costopasaje;

    public camarote(String codigo, String codreservacion, String numerohab, String costopasaje) {
        this.codigo = codigo;
        this.codreservacion = codreservacion;
        this.numerohab = numerohab;
        this.costopasaje = costopasaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodreservacion() {
        return codreservacion;
    }

    public void setCodreservacion(String codreservacion) {
        this.codreservacion = codreservacion;
    }

    public String getNumerohab() {
        return numerohab;
    }

    public void setNumerohab(String numerohab) {
        this.numerohab = numerohab;
    }

    public String getCostopasaje() {
        return costopasaje;
    }

    public void setCostopasaje(String costopasaje) {
        this.costopasaje = costopasaje;
    }
    
}
