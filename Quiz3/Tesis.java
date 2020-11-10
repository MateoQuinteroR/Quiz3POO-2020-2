package Quiz3;

public class Tesis extends Recurso{
    private final String autor;

    public Tesis(boolean prestado,String nombre, String autor) {
        super(prestado, nombre);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Tesis {" +
                "nombre = " + this.getNombre() + " autor = " + this.getAutor() +
                '}';
    }
}
