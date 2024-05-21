package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    private Nodo primero;
    private Nodo ultimo;
    private int longitud;

    private class Nodo {
        T valor;
        Nodo siguiente;
        Nodo anterior;
        Nodo(T v) {this.valor = v;
                    this.siguiente = null;
                    this.anterior = null;
                }


        }
    public ListaEnlazada() {
    this.primero = null;
    this.ultimo = null;
    this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);
       if (primero == null){
        primero = nuevo;
        ultimo = nuevo;
       }
       else{
        this.primero.anterior = nuevo;
        nuevo.siguiente = primero;
        primero = nuevo;
        
    }
    this.longitud ++;
    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (ultimo == null){
            primero = nuevo;
            ultimo = nuevo;
        }
        else{
            this.ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;

        }
    this.longitud ++;
    }

    public T obtener(int i) {

        int cont = 0;
        Nodo actual = this.primero;
            while (cont < i){
                actual = actual.siguiente;
                cont ++;
            } 
        return actual.valor;
    }

    public void eliminar(int i) {
        int cont = 0;
        Nodo aux = this.primero;
        while (cont < i) {
            aux = aux.siguiente;
            cont ++;
        }
        if (aux == primero){
            primero = aux.siguiente;
        }else{
            if (aux == ultimo){
            ultimo = aux.anterior;
            }
            else{
            aux.anterior.siguiente = aux.siguiente;
            aux.siguiente.anterior = aux.anterior;
            }
        }
        this.longitud --;
    }

    public void modificarPosicion(int indice, T elem) {
        int cont = 0;
        Nodo actual = this.primero;
            while (cont < indice){
                actual = actual.siguiente;
                cont ++;
            } 
        actual.valor = elem;
    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada nueva = new ListaEnlazada<T>();
        Nodo aux = this.primero;
        while (aux!=null){
            nueva.agregarAtras(aux.valor);
            aux = aux.siguiente;
        }
        return nueva;
    }
    public ListaEnlazada(ListaEnlazada<T> lista) {
        ListaEnlazada<T> copia = lista.copiar();
        this.longitud = copia.longitud;
        this.primero = copia.primero;
        this.ultimo = copia.ultimo;
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
