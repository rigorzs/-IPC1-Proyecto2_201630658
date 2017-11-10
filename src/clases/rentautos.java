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
public class rentautos {
    public String codigo;
    public String codcliente;
    public String pasajeros;
    public String tipo;
    public String dias;
    public String monto;
    public String entrega;
    public String devolver;
    public String condiciones;

    public rentautos(String codigo, String codcliente, String pasajeros, String tipo, String dias, String monto, String entrega, String devolver, String condiciones) {
        this.codigo = codigo;
        this.codcliente = codcliente;
        this.pasajeros = pasajeros;
        this.tipo = tipo;
        this.dias = dias;
        this.monto = monto;
        this.entrega = entrega;
        this.devolver = devolver;
        this.condiciones = condiciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getDevolver() {
        return devolver;
    }

    public void setDevolver(String devolver) {
        this.devolver = devolver;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
    
}
