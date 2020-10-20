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
public class NodoDE  implements Serializable{
    
     private Perro dato;
    private NodoDE siguienteDE;
    private NodoDE anteriorDE;

    public NodoDE(Perro dato) {
        this.dato = dato;
    }

    public Perro getDato() {
        return dato;
    }

    public void setDato(Perro dato) {
        this.dato = dato;
    }

    public NodoDE getSiguienteDE() {
        return siguienteDE;
    }

    public void setSiguienteDE(NodoDE siguienteDE) {
        this.siguienteDE = siguienteDE;
    }

    public NodoDE getAnteriorDE() {
        return anteriorDE;
    }

    public void setAnteriorDE(NodoDE anteriorDE) {
        this.anteriorDE = anteriorDE;
    }

}
