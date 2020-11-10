package Quiz3;

public class Revista extends Recurso implements Prestable {

    public Revista(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return "Revista {" +
                "nombre = " + this.getNombre() +
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
