/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu.umanizales.listase.modelo;

/**
 *
 * @author junor
 */
public class ListaSE {

    private Nodo cabeza;
    private Nodo cabezaOriginal;

    public ListaSE() {    
    }     

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    /**
     * Método para adicionar un nodo
     * 
        - Si tiene perros
            llamar a un ayudante
            recorrer todos los perros , mirando si tienen otro ammarrado
            cuando llegue al perro libre (No ammarrado a otro)
            amarra el nuevo perro
        si no tiene perros
           El perro entrante Es la cabeza
     */
    public void adicionarNodo(Perro dato)
    {
        if(cabeza==null)
        {
            //No tiene perros
            cabeza = new Nodo(dato);
        }
        else
        {
            // tiene perros
            Nodo temp = cabeza;
            while(temp.getSiguiente()!=null)
            {
                temp= temp.getSiguiente();
            }
            //Ubicado o parado en el último
            temp.setSiguiente(new Nodo(dato));
        }
         cabezaOriginal = cabeza; 
    }
    
    
    /**
     * Método que sirve para contar la cantidad de elementos de la Lista SE  
     * @return int cantidad de elementos
     */
    public int contarNodos()  //cabeza
    {
        if(cabeza!=null)
        {
            Nodo temp= cabeza;
            int cont=1;
            while(temp.getSiguiente()!=null) //Mientras el lazo este lleno
            {
                temp = temp.getSiguiente(); // Ayudante pase al siguiente perro
                cont++;
            }
            return cont;
        }
        else
        {
            return 0;
        }
    }
    
    /**
     * Método que adiciona un nodo al inicio
     * @param perro Dato a agregar     * 
     */
    public void adicionarNodoAlInicio(Perro perro)
    {
        if(cabeza!=null)
        {
            Nodo temp = new Nodo(perro);
            temp.setSiguiente(cabeza);
            cabeza= temp;
        }
        else
        {
            cabeza = new Nodo(perro);
        }
    }
    
    /**
     * Método que permite intercambiar los datos de los extremos de la lista     * 
     */
    public void intercambiarExtremos()
    {
        if(cabeza!=null)
        {
           Nodo temp = cabeza;
           while(temp.getSiguiente()!=null)
           {
               temp = temp.getSiguiente();
           }
           /// Parado en el último nodo
           Perro perrotemp = cabeza.getDato();
           cabeza.setDato(temp.getDato());
           temp.setDato(perrotemp);           
        }
    }
    
    
    public void invertir() {
        if (cabeza != null) {
            ListaSE listaTemporal = new ListaSE();
            Nodo temp = cabeza;
            while (temp != null)//Recorre de principio a fin
            {
                listaTemporal.adicionarNodoAlInicio(temp.getDato());
                temp = temp.getSiguiente();//Ayudante pase al siguiente perro
            }
            cabeza = listaTemporal.getCabeza();
        }
    }
    
    public void eliminarNodo(Perro perro) {

        Nodo temp = cabeza;
        Nodo temp2;

        if (cabeza.getDato().getNumero() == perro.getNumero()) {

            cabeza = cabeza.getSiguiente();
        }
        while (temp.getSiguiente() != null) {

            temp2 = temp;       //Guardo el anterior
            temp = temp.getSiguiente();

            if (perro.getNumero() == temp.getDato().getNumero()) {

                temp2.setSiguiente(temp.getSiguiente());
                temp = temp2;
            }
        }
        //mostrarListadoPerros();
    }

      public void ordenarGenero(String generoWeb) {

            if (cabeza != null) {

                ListaSE listaTemporal = new ListaSE();

                for (int i = 0; i <= 1; i++) {
                    Nodo temp = cabeza;
                    while (temp != null) {

                        if (temp.getDato().getGenero().equals(generoWeb)) {
                            listaTemporal.adicionarNodo(temp.getDato());//                                         
                        }
                        temp = temp.getSiguiente();
                    }

                    if (generoWeb.equals("macho")) {
                        generoWeb = "hembra";
                    } else {
                        generoWeb = "macho";
                    }

                }

                cabeza = listaTemporal.getCabeza();
//         mostrarListadoPerros();
//        System.out.println("lista desosrdenada: ");
//        cabeza = cabezaOriginal;
//         mostrarListadoPerros();
            }
//        }

    }

 
    public Perro buscarPosicion(int posicion) {

        if (cabeza != null) {

            Nodo temp = cabeza;
            int cont = 1;

            while (posicion != cont) {

                temp = temp.getSiguiente();// Ayudante pase l siguiente perro
                cont++;
            }
            return temp.getDato();
        }

        return null;
    }

    
    
}
