/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.umanizales.listase.prueba;
import com.edu.umanizales.listase.modelo.ListaSE;
import com.edu.umanizales.listase.modelo.Perro;
/**
 *
 * @author junor
 */
public class ProbarListaSE {
public static void main(String... args)
    {
        //Instanciar una lista se
        ListaSE listaPerros= new ListaSE();
        
        Perro lulu = new Perro("Lulú",(byte) 1, (byte)9,"H");
        listaPerros.adicionarNodo(lulu);
        
        Perro firulais = new Perro("Firulais", (byte)2, (byte)4,"M");
        listaPerros.adicionarNodo(firulais);
        
        Perro pastor = new Perro("Tobby", (byte)3, (byte)6,"M");
        listaPerros.adicionarNodo(pastor);
        
        System.out.println("finalizao");
    }
}
