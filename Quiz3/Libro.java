package Quiz3;

public class Libro extends Recurso implements Prestable{

    private final String autor;

    public Libro(boolean prestado, String nombre, String autor) {
        super(prestado, nombre);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro {" +
                "nombre = " + this.getNombre() + " autor = " + this.getAutor() +
                '}';
    }

    @Override
    public void prestar() {

        this.isPrestado();
    }

    @Override
    public void devolver() {

        this.isPrestado();
    }
}
