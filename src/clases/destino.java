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
public class destino {
    public String codigo;
    public String pais;
    public String ciudad;
    public String direccion;
    public String nomdestino;
    public String descridesti;
    public String descrimedidas;
    public destino(){
        codigo="";
        pais="";
        ciudad="";
        direccion="";
        nomdestino="";
        descridesti="";
        descrimedidas="";
    }
    public destino(String cod,String pa,String ciu,String dir,String nom,String des,String descri){
        codigo=cod;
        pais=pa;
        ciudad=ciu;
        direccion=dir;
        nomdestino=nom;
        descridesti=des;
        descrimedidas=descri;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getNomdestino() {
        return nomdestino;
    }

    public void setNomdestino(String nomdestino) {
        this.nomdestino = nomdestino;
    }

    public String getDescridesti() {
        return descridesti;
    }

    public void setDescridesti(String descridesti) {
        this.descridesti = descridesti;
    }

    public String getDescrimedidas() {
        return descrimedidas;
    }

    public void setDescrimedidas(String descrimedidas) {
        this.descrimedidas = descrimedidas;
    }
}
