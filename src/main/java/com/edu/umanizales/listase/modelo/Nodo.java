/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.umanizales.listase.modelo;

import java.io.Serializable;
/**
 *
 * @author junor
 */
public class Nodo implements Serializable {

    private Perro dato;
    private Nodo siguiente;

    public Nodo(Perro dato) {
        this.dato = dato;
    }

    public Perro getDato() {
        return dato;
    }

    public void setDato(Perro dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }    
    

}
