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
public class entidad {
    public String codentidad;
    public String codcliente;
    public String tipotarjeta;
    public String codtarjeta;
    public String saldo;
    public String maximo;
    public entidad(){
        codentidad="";
        codcliente="";
        tipotarjeta="";
        codtarjeta="";
        saldo="";
        maximo="";
    }
    public entidad(String enti,String cli,String taje,String codtarje,String sal,String max){
        codentidad=enti;
        codcliente=cli;
        tipotarjeta=taje;
        codtarjeta=codtarje;
        saldo=sal;
        maximo=max;
        
    }

    public String getCodentidad() {
        return codentidad;
    }

    public void setCodentidad(String codentidad) {
        this.codentidad = codentidad;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getTipotarjeta() {
        return tipotarjeta;
    }

    public void setTipotarjeta(String tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }

    public String getCodtarjeta() {
        return codtarjeta;
    }

    public void setCodtarjeta(String codtarjeta) {
        this.codtarjeta = codtarjeta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }
    
}
