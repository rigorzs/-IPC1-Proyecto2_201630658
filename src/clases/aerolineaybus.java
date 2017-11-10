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
public class aerolineaybus {
    public String codigo;
    public String horasal;
    public String horallega;
    public String capacidad;
    public String destino;
    public aerolineaybus(){
        codigo="";
        horasal="";
        horallega="";
        capacidad="";
        destino="";
    }
    public aerolineaybus(String cod,String sal,String llega,String capa,String desti){
        codigo=cod;
        horasal=sal;
        horallega=llega;
        capacidad=capa;
        destino=desti;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorasal() {
        return horasal;
    }

    public void setHorasal(String horasal) {
        this.horasal = horasal;
    }

    public String getHorallega() {
        return horallega;
    }

    public void setHorallega(String horallega) {
        this.horallega = horallega;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
