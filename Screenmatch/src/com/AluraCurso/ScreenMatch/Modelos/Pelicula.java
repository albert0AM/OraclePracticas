package com.AluraCurso.ScreenMatch.Modelos;

public class Pelicula {
     String nombre;
     String fechaDeLanzamiento;
     int duracionEnMinutos;

    boolean incluidoEnelPlan;
    private double sumaDeNotas;
    private int cantidadDeNotas;


     int getCantidadDeNotas() {
        return cantidadDeNotas;
    }

     int getSumaDeNotas() {
        return (int) sumaDeNotas;
    }

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }

    //En el parentesis se le pasa un argumento a la funcion
    void Evalua(double nota ){
        sumaDeNotas += nota;
        cantidadDeNotas++;
        //sumaDeNotas = sumaDeNotas + nota;
        // son lo mismo

    }

    //Devuelve la media de las notas
    double calculaMedia(){
        return sumaDeNotas / cantidadDeNotas;
    }


}
