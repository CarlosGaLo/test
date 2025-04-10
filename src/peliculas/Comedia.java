package peliculas;

public class Comedia extends Pelicula{

    public Comedia(String titulo, int duracion){
        super(titulo,duracion);
    }

    @Override
    public void reproducir(){
        System.out.println("Prepárate a reir con " + titulo);
    }

    public String mejorPelicula(){
        return "La mejor película de comedia del mundo es Dos Tontos muy tontos";
    }
}
