package Quiz3.AppBiblioteca;

import Quiz3.*;

public class AppBiblioteca {

    public static void main(String[] args) {
        Biblioteca bibliotecaUCO = new Biblioteca();

        Libro libro1 = new Libro(false,"Angeles & Demonios","Dan Brown");
        Revista revista1 = new Revista(false,"HomeCenter");
        Tesis tesis1 = new Tesis(false,"El gato de Shrodinger es un reptiliano", "Ernestino Clandestino");
        Diccionario diccionario1 = new Diccionario(false,"Larousse", "Italiano-Español");
        AlbumFotografico album1 = new AlbumFotografico(false,"Colombia en la colonia",2000);

        bibliotecaUCO.addRecurso(libro1);
        bibliotecaUCO.addRecurso(revista1);
        bibliotecaUCO.addRecurso(tesis1);
        bibliotecaUCO.addRecurso(diccionario1);
        bibliotecaUCO.addRecurso(album1);

        bibliotecaUCO.prestarRecurso(libro1);
        bibliotecaUCO.prestarRecurso(revista1);
        bibliotecaUCO.prestarRecurso(tesis1);
        bibliotecaUCO.prestarRecurso(diccionario1);
        bibliotecaUCO.prestarRecurso(album1);

        bibliotecaUCO.getRecursosPrestados();


        bibliotecaUCO.devolverRecurso(libro1);
        bibliotecaUCO.devolverRecurso(revista1);
        bibliotecaUCO.devolverRecurso(tesis1);
        bibliotecaUCO.devolverRecurso(diccionario1);
        bibliotecaUCO.devolverRecurso(album1);

        bibliotecaUCO.getRecursosPrestados();
    }
}
