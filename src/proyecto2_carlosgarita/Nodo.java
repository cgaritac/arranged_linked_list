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
public class Nodo {
    
    //Definición de variables globales
    private Peliculas pelicula;
    private Nodo siguiente; //Puntero al nodo siguiente
    
    //Constructor
    public Nodo(Peliculas pelicula){
        this.pelicula = pelicula;
        this.siguiente = null;
    }
    
    //Método para obtener los datos de un nodo específico
    public Peliculas obtenerPelicula(){
        return pelicula;
    }
    
    //Método para elnazar un nuevo nodo siguiente
    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }
    
    //Metodo para obtener el valor del nodo siguiente
    public Nodo obtenerSiguiente(){
        return siguiente;
    }            
}
