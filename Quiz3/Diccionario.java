package Quiz3;

public class Diccionario extends Recurso implements Prestable{

    private final String idioma;

    public Diccionario(boolean prestado, String nombre, String idioma) {
        super(prestado, nombre);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    @Override
    public String toString() {
        return "Diccionario {" +
                "nombre = " + this.getNombre() + " idioma = " + this.getIdioma() +
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
