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
public class asiento {
    public String codigo;
    public String codreservacion;
    public String numeroasiento;
    public String claseasiento;
    public String costo;

    public asiento(String codigo, String codreservacion, String numeroasiento, String claseasiento, String costo) {
        this.codigo = codigo;
        this.codreservacion = codreservacion;
        this.numeroasiento = numeroasiento;
        this.claseasiento = claseasiento;
        this.costo = costo;
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

    public String getNumeroasiento() {
        return numeroasiento;
    }

    public void setNumeroasiento(String numeroasiento) {
        this.numeroasiento = numeroasiento;
    }

    public String getClaseasiento() {
        return claseasiento;
    }

    public void setClaseasiento(String claseasiento) {
        this.claseasiento = claseasiento;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
