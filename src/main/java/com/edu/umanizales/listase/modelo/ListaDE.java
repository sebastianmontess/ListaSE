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
public class ListaDE {
     private NodoDE cabezaDe;

    public ListaDE() {
    }

    public NodoDE getCabezaDe() {
        return cabezaDe;
    }

    public void setCabezaDe(NodoDE cabezaDe) {
        this.cabezaDe = cabezaDe;
    }

    public int contarNodos() 
    {
        if (cabezaDe != null) {
            NodoDE temp = cabezaDe;
            int cont = 1;
            while (temp.getSiguienteDE() != null)
            {
                temp = temp.getSiguienteDE();
                cont++;
            }
            return cont;
        } else {
            return 0;
        }
    }

//metodo para adicionar nodo
    public void adicionarNodo(Perro dato) {

        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;
            while (temp.getSiguienteDE() != null) {

                temp = temp.getSiguienteDE();

            }
          

            temp.setSiguienteDE(new NodoDE(dato));
            temp.getSiguienteDE().setAnteriorDE(temp);

        } else {

            cabezaDe = new NodoDE(dato);

        }

    }

    //metodo para adicionar nodo al inicio
    public void adicionarAlInicio(Perro dato) {

        if (cabezaDe != null) {

            //SI HAY DATOS
            NodoDE temp = new NodoDE(dato);
            temp.setSiguienteDE(cabezaDe);
            cabezaDe.setAnteriorDE(temp);
            cabezaDe = temp;

        } else {

            cabezaDe = new NodoDE(dato);
        }

    }

    //metodo para eliminar nodo x posicion
    public void eliminarxPosicion(int pos) {

        if (cabezaDe != null) {

            if (pos == 1) {

                cabezaDe = cabezaDe.getSiguienteDE();

            } else {

                int cont = 1;

                NodoDE temp = cabezaDe;

                while (temp.getSiguienteDE() != null && cont != pos) {

                    temp = temp.getSiguienteDE();

                    cont++;

                }

                if (cont == pos && temp.getSiguienteDE() != null) {

                    temp.getAnteriorDE().setSiguienteDE(temp.getSiguienteDE());
                    temp.getSiguienteDE().setAnteriorDE(temp.getAnteriorDE());


                } else if (temp.getSiguienteDE() == null) {

                    temp.getAnteriorDE().setSiguienteDE(null);
                    temp.setAnteriorDE(null);

                }

            }

        }

    }

    //metodo de eliminar x posicion
    public void eliminarPorPosicion(int posicion) {

        if (cabezaDe != null) {

            if (posicion == 1) {

                cabezaDe = cabezaDe.getSiguienteDE();
                if (cabezaDe != null) {

                    cabezaDe.setAnteriorDE(null);
                }
            } else {

                NodoDE temp = cabezaDe;
                int contador = 1;
                while (contador != posicion - 1) {

                    temp = temp.getSiguienteDE();
                    contador++;

                }
              
                temp.setSiguienteDE(temp.getSiguienteDE().getSiguienteDE());
                if (temp.getSiguienteDE() != null) {
                    temp.getSiguienteDE().setAnteriorDE(temp);
                }
            }
        }

    }

    //metodo de eliminacion directa
    public void eliminar(Perro dato) {

        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;

            while (temp.getDato().getNumero() != dato.getNumero()) {

                temp = temp.getSiguienteDE();

            }
            if (temp == cabezaDe) {

                cabezaDe = cabezaDe.getSiguienteDE();
                if (cabezaDe != null) {

                    cabezaDe.setAnteriorDE(null);
                }
            } else {

                temp.getAnteriorDE().setSiguienteDE(temp.getSiguienteDE());
                if (temp.getSiguienteDE() != null) {

                    temp.getSiguienteDE().setAnteriorDE(temp.getAnteriorDE());

                }
            }
        }

    }

    //metoco para intercambiar posiciones
    public void intercambiarPosiciones(int nodoUno, int nodoDos) {

        if (cabezaDe != null) {

            Perro temporalUno = buscarPosicionDE(nodoUno);
            Perro temporalDos = buscarPosicionDE(nodoDos);

            NodoDE temp = cabezaDe;
            int cont = 1;

            if (nodoUno < nodoDos) {

                while (temp.getSiguienteDE() != null && cont != nodoUno) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoUno) {

                    temp.setDato(temporalDos);
                }
                cont = 1;
                temp = cabezaDe;

                while (temp.getSiguienteDE() != null && cont != nodoDos) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoDos) {
                    temp.setDato(temporalUno);

                }
            } else if (nodoUno > nodoDos) {

                while (temp.getSiguienteDE() != null && cont != nodoDos) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoDos) {

                    temp.setDato(temporalUno);
                }
                cont = 1;
                temp = cabezaDe;

                while (temp.getSiguienteDE() != null && cont != nodoUno) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoUno) {
                    temp.setDato(temporalDos);

                }

            }

        }

    }

    public int contarNodosDE() 
    {
        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;
            int cont = 1;
            while (temp.getSiguienteDE() != null) 
            {
                temp = temp.getSiguienteDE();
                cont++;
            }
            return cont;
        } else {
            return 0;
        }
    }

    public void mostrarLista() {

        NodoDE recorrer = cabezaDe;
        while (recorrer != null) {

            System.out.println("[ " + recorrer.getDato() + "]");
            recorrer = recorrer.getSiguienteDE();

        }

    }

    public void recorrerAlContrario() {

        NodoDE tmp = cabezaDe;
        while (tmp != null) {
            System.out.println(tmp.getDato());
            tmp = tmp.getAnteriorDE();
        }
    }

    public void eliminacionDirecta(NodoDE nodo) {

        if (nodo == cabezaDe) {

            cabezaDe = cabezaDe.getSiguienteDE();

        } else if (nodo.getSiguienteDE() != null) {

            nodo.getAnteriorDE().setSiguienteDE(nodo.getSiguienteDE());
            nodo.getSiguienteDE().setAnteriorDE(nodo.getAnteriorDE());
            nodo.setSiguienteDE(null);
            nodo.setAnteriorDE(null);

        } else if (nodo.getSiguienteDE() == null) {

            nodo.getAnteriorDE().setSiguienteDE(null);
            nodo.setAnteriorDE(null);

        }
    }

    public Perro buscarPosicionDE(int posicion) {

        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;
            int cont = 1;

            while (posicion != cont) {

                temp = temp.getSiguienteDE();
                cont++;
            }
            return temp.getDato();
        }

        return null;
    }

    //metodo para agregar en poscion
    public void adicionarNodoEnSPosicion(Perro dato, int posicion) {

        if (cabezaDe != null) {

            if (posicion == 1) {

                adicionarAlInicio(dato);

            } else {

                ListaDE listaTemporal = new ListaDE();
                NodoDE temp = cabezaDe;
                int cont = 1;

                while (temp != null) {

                    listaTemporal.adicionarNodo(temp.getDato());
                    temp = temp.getSiguienteDE();
                    cont++;

                    if (cont == posicion) {

                        listaTemporal.adicionarNodo(dato);
                    }
                }
                if (posicion > cont) {

                    listaTemporal.adicionarNodo(dato);
                }
                cabezaDe = listaTemporal.getCabezaDe();
            }

        } else {

            cabezaDe = new NodoDE(dato);
        }

    }

    public void intercambiarExtremosDE() {

        if (cabezaDe != null) {
            NodoDE temp = cabezaDe;
            while (temp.getSiguienteDE() != null) {
                temp = temp.getSiguienteDE();
            }
          
            Perro perrotemp = cabezaDe.getDato();
            cabezaDe.setDato(temp.getDato());
            temp.setDato(perrotemp);
        }
    }

    public void invertirDE() {

        if (cabezaDe != null) {
            ListaDE listaTemporal = new ListaDE();
            NodoDE temp = cabezaDe;
            while (temp != null)
            {
                listaTemporal.adicionarAlInicio(temp.getDato());
                temp = temp.getSiguienteDE();
            }
            cabezaDe = listaTemporal.getCabezaDe();
        }
    }

    public void ordenarMasculinoDE() {

        if (cabezaDe != null) {

            ListaDE listaTemporal = new ListaDE();

            NodoDE temp = cabezaDe;

            while (temp != null)
            {

                if ("M".equals(temp.getDato().getGenero())) {

                    listaTemporal.adicionarAlInicio(temp.getDato());

                } else {

                    listaTemporal.adicionarNodo(temp.getDato());
                }

                temp = temp.getSiguienteDE();

            }

            cabezaDe = listaTemporal.getCabezaDe();

        }

    }

    public void ordenarFemeninoDE() {

        if (cabezaDe != null) {

            ListaDE listaTemporal = new ListaDE();

            NodoDE temp = cabezaDe;

            while (temp != null)
            {

                if ("F".equals(temp.getDato().getGenero())) {

                    listaTemporal.adicionarAlInicio(temp.getDato());

                } else {

                    listaTemporal.adicionarNodo(temp.getDato());
                }

                temp = temp.getSiguienteDE();

            }

            cabezaDe = listaTemporal.getCabezaDe();

        }

    }

}
