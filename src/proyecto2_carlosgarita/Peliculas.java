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
public class Peliculas {
    
    //Definición de variables de instancia
    private String nombre, genero;
    private int duracion, valor;
    
    //Método constructor
    public Peliculas() {
    }          
    
    //Metodos Get y Set de todas las variables de instancia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //Método toString
    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", valor=" + valor + '}';
    }                 
}
