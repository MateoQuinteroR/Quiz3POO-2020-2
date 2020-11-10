package Quiz3;

public abstract class Recurso {

    private boolean prestado;
    private final String nombre;

    public Recurso(boolean prestado, String nombre) {
        this.prestado = prestado;
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getNombre() {
        return nombre;
    }
}
