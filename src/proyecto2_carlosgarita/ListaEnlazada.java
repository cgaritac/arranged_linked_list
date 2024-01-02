/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_carlosgarita;

/**
 *
 * @author cgari
 */
public class ListaEnlazada {

    //Definición de variables de instancia
    private Nodo cabeza;
    private int longitud;

    //Método constructor
    public ListaEnlazada() {
        this.cabeza = null;
        this.longitud = 0;
    }

    //Método para agregar película en orden ascendente por duración
    public boolean agregar(Peliculas pelicula) {
        
        //Definición de variables locales
        int contador = 0;        
        Nodo nuevo = new Nodo(pelicula);
        
        this.longitud++; //Incremento en la longitud de la lista cuando se ejecuta el método
        
        //Condicional en caso de que no hayan datos en la lista aún
        if (this.cabeza == null) {
            this.cabeza = nuevo;
            return true;
            
        } else {
            
            //Asigna el valor de la cabeza al aux
            Nodo aux = this.cabeza;
            
            //Condicional en caso de que el valor de la cabeza sea mayor que el que se está ingresando
            if (aux.obtenerPelicula().getDuracion() > pelicula.getDuracion()) {
                nuevo.enlazarSiguiente(aux);
                this.cabeza = nuevo;
                return true;
                
            } else {
                
                //Ciclo para reccorrer la lista enlazada
                while (aux.obtenerSiguiente() != null) {
                    
                    //Condicional en caso de que el valor siguiente al del aux sea mayor que el que se está ingresando
                    if (aux.obtenerSiguiente().obtenerPelicula().getDuracion() > pelicula.getDuracion()) {
                        nuevo.enlazarSiguiente(aux.obtenerSiguiente());
                        aux.enlazarSiguiente(nuevo);
                        return true;
                    }
                    
                    //Asigna el valor siguiente al aux
                    aux = aux.obtenerSiguiente();
                }
                
                //Enlaza el aux con el nuevo
                aux.enlazarSiguiente(nuevo);
                return true;
            }
        }
    }    

    //Método para obtener un nodo específico
    public Peliculas obtener(int indice) {
        
        //Definición de variables locales
        int contador = 0;
        Nodo temp = this.cabeza;

        //Ciclo para recorrer la lista enlazada hasta llegar antes del valor indicado en el índice
        while (contador < indice) {
            temp = temp.obtenerSiguiente();
            contador++;
        }
        
        return temp.obtenerPelicula();
    }

    //Método para limpiar la lista 
    public void limpiar() {
        
        //Definición de variable locales
        this.cabeza = null;        
        this.longitud = 0;
    }  

    //Método para eliminar un nódo específico
    public void eliminar(int indice) {

        //Condicional en caso de que se desee eliminar la cabeza
        if (indice == 0) {
            this.cabeza = this.cabeza.obtenerSiguiente();
            
        } else {
            
            //Definición de variables locales
            int contador = 0;
            Nodo temp = this.cabeza;

            //Ciclo para recorrer la lista enlazada hasta llegar del valor indicado en el índice
            while (contador < indice - 1) {
                temp = temp.obtenerSiguiente();
                contador++;
            }

            //Enlaza saltandose el nodo que se desea eliminar, con lo cual se le elimina de la lista enlazada
            temp.enlazarSiguiente(temp.obtenerSiguiente().obtenerSiguiente());
        }
        
        this.longitud--;
    }  

    //Método para obtener la logitud de la lista enlazada
    public int longitud() {
        return this.longitud;
    }
}
