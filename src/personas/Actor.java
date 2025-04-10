package personas;

public class Actor extends Persona {
    private String personaje;

    public Actor(String nombre, String personaje) {
        super(nombre);
        this.personaje = personaje;
    }

    public void interpretar() {
        System.out.println("🎭 " + nombre + " interpreta a " + personaje);
    }
}