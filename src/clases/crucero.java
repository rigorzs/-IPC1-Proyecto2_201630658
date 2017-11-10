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
public class crucero {
    public String codigo;
    public String fechasal;
    public String fechallega;
    public String capacidad;
    public String duracion;
    public String descripcion;
    public String destino;
    public crucero(){
        codigo="";
        fechasal="";
        fechallega="";
        capacidad="";
        duracion="";
        descripcion="";
        destino="";
    }
    public crucero(String cod,String sal,String llega,String capa,String dura,String desci,String desti){
        codigo=cod;
        fechasal=sal;
        fechallega=llega;
        capacidad=capa;
        duracion=dura;
        descripcion=desci;
        destino=desti;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechasal() {
        return fechasal;
    }

    public void setFechasal(String fechasal) {
        this.fechasal = fechasal;
    }

    public String getFechallega() {
        return fechallega;
    }

    public void setFechallega(String fechallega) {
        this.fechallega = fechallega;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
