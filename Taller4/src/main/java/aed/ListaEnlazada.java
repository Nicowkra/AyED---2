package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    private Nodo primero;
    private Nodo ultimo;

    private class Nodo {
        T valor;
        Nodo siguiente;
        Nodo anterior;
        Nodo(T v) {this.valor = v;}
        }
    public ListaEnlazada() {
    this.primero = new Nodo(null);
    this.ultimo = new Nodo(null);
    }

    public int longitud() {
        int res = 0;
        if (primero != null){
            Nodo actual = primero;
            while (actual.siguiente != null){
                actual = actual.siguiente;
                res ++;
            } 
        }
        return res;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);
        nuevo.siguiente = primero;
        primero = nuevo;
    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (primero == null){
            primero = nuevo;
        }
        else{
            Nodo actual = primero;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual = nuevo;
        }
    }

    public T obtener(int i) {
        T res = null;
        int j = 0;
        if (primero != null){
            Nodo actual = primero;
            while (j != i){
                actual = actual.siguiente;
                j ++;
            } 
            res = actual.valor;
        }
        return res;
    }

    public void eliminar(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada<T> copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
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
