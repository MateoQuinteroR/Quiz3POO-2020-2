package Quiz3;

public class AlbumFotografico extends Recurso{

    private final int ano;

    public AlbumFotografico(boolean prestado, String nombre, int ano) {
        super(prestado, nombre);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Album {" +
                "nombre = " + this.getNombre() + " año = " + this.getAno() +
                '}';
    }
}
