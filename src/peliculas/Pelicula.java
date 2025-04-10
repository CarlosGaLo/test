package peliculas;

public class Pelicula {
    protected String titulo;
    protected int duracion;
    public int anio;
    private int ratio;

    public Pelicula(String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, int duracion, int anio, int ratio){
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.ratio = ratio;
    }

    public Pelicula(){
    }

    public void reproducir(){
        System.out.println("Reproduciendo película: " + titulo + " (" + duracion + ") mins");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", anio=" + anio +
                ", ratio=" + ratio +
                '}';
    }
}
