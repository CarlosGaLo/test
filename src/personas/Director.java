package personas;

public class Director extends Persona{
    private int cantidadDePeliculas;

    public Director(String nombre, int cantidadDePeliculas){
        super(nombre);
        this.cantidadDePeliculas = cantidadDePeliculas;
    }

    public void dirigir(){
        System.out.println("🎬 " + nombre + " ha dirigido " + cantidadDePeliculas + " películas.");
    }
}
