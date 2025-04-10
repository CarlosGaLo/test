package peliculas;

public class Documental extends Pelicula{
    private String tema;

    public Documental(String titulo, int duracion, String tema){
        super(titulo, duracion);
        this.tema = tema;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo documental: " + titulo);
    }

    public void mostrarTema(){
        System.out.println("El tema del documental es " + tema);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
