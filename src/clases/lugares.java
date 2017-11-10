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
public class lugares {
    public String codigo;
    public String lugar;
    public String descri;
    public String pais;
    public String ciudad;
    public String direccion;
    public String minimo;
    public String horactividad;
    public String horafuncion;
    public String recomendacion;
    public String codestino;
    public lugares(){
        codigo="";
        lugar="";
        descri="";
        pais="";
        ciudad="";
        direccion="";
        minimo="";
        horactividad="";
        horafuncion="";
        recomendacion="";
        codestino="";
    }
    public lugares(String cod,String luga,String desc,String pa,String ciu,String dir,String min,String act,String func,String reco,String dest){
        codigo=cod;
        lugar=luga;
        descri=desc;
        pais=pa;
        ciudad=ciu;
        direccion=dir;
        minimo=min;
        horactividad=act;
        horafuncion=func;
        recomendacion=reco;
        codestino=dest;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public String getHoractividad() {
        return horactividad;
    }

    public void setHoractividad(String horactividad) {
        this.horactividad = horactividad;
    }

    public String getHorafuncion() {
        return horafuncion;
    }

    public void setHorafuncion(String horafuncion) {
        this.horafuncion = horafuncion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getCodestino() {
        return codestino;
    }

    public void setCodestino(String codestino) {
        this.codestino = codestino;
    }
    
}
