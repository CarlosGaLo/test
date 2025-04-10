import funciones.Calculadora;
import peliculas.Comedia;
import peliculas.Documental;
import personas.Actor;
import personas.Director;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al videoclub");

        System.out.println("Funciones matemáticas");
        System.out.println("3+5 = " + Calculadora.sumar(3,5));
        System.out.println("10 / 2 = " + Calculadora.dividir(10, 2));
        System.out.println("10 / 0 = " + Calculadora.dividir(10, 0));
        System.out.println();

        // Actores y Directores
        Actor actor = new Actor("Emma Stone", "Valquiria Espacial");
        Director director = new Director("Christopher Nolan", 12);

        actor.presentarse();
        actor.interpretar();
        director.presentarse();
        director.dirigir();

        // Películas
        Comedia comedia = new Comedia("Locuras en el Espacio", 110);
        Documental documental = new Documental("La Vida de las Estrellas", 50, "Astronomía");

        System.out.println("📽️ Reproduciendo películas:");
        comedia.reproducir();
        documental.reproducir();
        documental.mostrarTema();

        //System.out.println(documental.toString());
    }
}