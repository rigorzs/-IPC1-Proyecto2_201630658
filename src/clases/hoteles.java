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
public class hoteles {
    public String codigo;
    public String direccion;
    public String numtotal;
    public String destino;
    public hoteles(){
        codigo="";
        direccion="";
        numtotal="";
        destino="";
    }
    public hoteles(String cod,String dir,String num,String dest){
        codigo=cod;
        direccion=dir;
        numtotal=num;
        destino=dest;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumtotal() {
        return numtotal;
    }

    public void setNumtotal(String numtotal) {
        this.numtotal = numtotal;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
