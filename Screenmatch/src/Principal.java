import com.AluraCurso.ScreenMatch.Modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
     Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "El Señor de los Anillos";
        miPelicula.fechaDeLanzamiento = "2001";
        miPelicula.duracionEnMinutos = 178;
        miPelicula.Evalua(10.0);
        miPelicula.Evalua(10.0);
        miPelicula.Evalua(8.0);


    miPelicula.muestraFichaTecnica();
    System.out.println(miPelicula.getCantidadDeNotas());
    System.out.println(miPelicula.calculaMedia());






















//     com.AluraCurso.ScreenMatch.Modelos.Pelicula miPelicula2 = new com.AluraCurso.ScreenMatch.Modelos.Pelicula();
//        miPelicula2.nombre = "El Hobbit";
//        miPelicula2.fechaDeLanzamiento = "2012";
//        miPelicula2.duracionEnMinutos = 169;
    }
}
