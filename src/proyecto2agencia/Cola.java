/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2agencia;

/**
 *
 * @author Juan RigobertoZuñiga
 */
public class Cola {
    
    Nodo cabeza;
    Nodo fondo;
    public Cola() {
        cabeza = null;
        fondo = null;
    }
    
    boolean vacia(){
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarCola(Object objeto){
        Nodo nuevo = new Nodo(objeto);
        nuevo.dato = nuevo;
        nuevo.siguiente = null;
        if (vacia()) {
            cabeza = nuevo;
            fondo = nuevo;
        }else{
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }
    }
    
    public Object extrarCola(){
        if(!vacia()){
            Object info = cabeza.dato;
            if (cabeza == fondo) {
                cabeza = null;
                fondo = null;
            }else{
                cabeza = cabeza.siguiente;
            }
            return info;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimirCola(){
        Nodo aux = cabeza;
        while(aux!=null){
            System.out.print(aux.dato+", ");
            aux = aux.siguiente;
        }
    }
}
