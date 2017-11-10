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
public class cliente {
    public String codigo;
    public String nombre;
    public String apellido;
    public String tarjeta;
    public String fechan;
    public String telefono;
    public String celular;
    public String direccionh;
    public String frecuencia;
    public String monto;
    public cliente(){
        codigo="";
        nombre="";
        apellido="";
        tarjeta="";
        fechan="";
        telefono="";
        celular="";
        direccionh="";
        frecuencia="";
        monto="";
    }
    public cliente(String cod,String nom,String ap,String tar,String fec,String tel,String cel,String dir,String fre,String mont){
        codigo=cod;
        nombre=nom;
        apellido=ap;
        tarjeta=tar;
        fechan=fec;
        telefono=tel;
        celular=cel;
        direccionh=dir;
        frecuencia=fre;
        monto=mont;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getFechan() {
        return fechan;
    }

    public void setFechan(String fechan) {
        this.fechan = fechan;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccionh() {
        return direccionh;
    }

    public void setDireccionh(String direccionh) {
        this.direccionh = direccionh;
    }
    
}
