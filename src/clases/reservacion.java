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
public class reservacion {
    public String codigo;
    public String codpaquete;
    public String codcliente;
    public String reserva;
    public String salida;
    public String dias;
    public String estadoreserva;
    public String saldo;

    public reservacion(String codigo, String codpaquete, String codcliente, String reserva, String salida, String dias, String estadoreserva, String saldo) {
        this.codigo = codigo;
        this.codpaquete = codpaquete;
        this.codcliente = codcliente;
        this.reserva = reserva;
        this.salida = salida;
        this.dias = dias;
        this.estadoreserva = estadoreserva;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodpaquete() {
        return codpaquete;
    }

    public void setCodpaquete(String codpaquete) {
        this.codpaquete = codpaquete;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getEstadoreserva() {
        return estadoreserva;
    }

    public void setEstadoreserva(String estadoreserva) {
        this.estadoreserva = estadoreserva;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
}
