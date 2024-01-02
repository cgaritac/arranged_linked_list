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
public class MetodosVarios {

    public MetodosVarios() {
    }
    
    //Método para calcular el monto de la película con base en su duración
    public int calcularValor(int duracion){
        
        //Definición de variables locales
        int valor = 0;
        
        //Condicionales para definir el valor de la pelicula con base en la duración
        if (duracion <= 75 && duracion >= 60) {
            valor = 2000;
        }

        if (duracion <= 90 && duracion > 75) {
            valor = 2500;
        }

        if (duracion <= 180 && duracion > 90) {
            valor = 3000;
        }

        if (duracion <= 240 && duracion > 180) {
            valor = 3500;
        }

        if (duracion <= 300 && duracion > 240) {
            valor = 4000;
        }

        return valor;
    }
}
