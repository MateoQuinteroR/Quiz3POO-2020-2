package Quiz3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private final List<Recurso> recursos;
    private final List<Recurso> recursosPrestados;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
        this.recursosPrestados = new ArrayList<>();
    }

    public void addRecurso(Recurso recursoAIngresar) {

        boolean existe = recursos.stream().anyMatch(r -> r.getNombre().equals(recursoAIngresar.getNombre()));

        if (!existe) {
            this.recursos.add(recursoAIngresar);
        }
    }

    public boolean prestarRecurso(Recurso recurso){

        if (!recurso.isPrestado() && (recurso instanceof Prestable)){
            recursosPrestados.add(recurso);
            System.out.println("Se ha prestado exitosamente el recurso de nombre: "+ recurso.getNombre() +"\n");
            recurso.setPrestado(true);

        }else{
            System.out.println("El recurso que solicita no se encuentra disponible en el momento.\n");
        }
        return recurso.isPrestado();
    }

    public boolean devolverRecurso(Recurso recurso){

        if (recursosPrestados.stream().anyMatch(r -> r.getNombre() == recurso.getNombre())){

            recursosPrestados.remove(recurso);
            System.out.println("Se ha devuelto "+ recurso.getNombre()+" con éxito.\n");
            recurso.setPrestado(false);

        }else{

            System.out.println("El recurso que menciona no ha sido prestado recientemente.\n");
        }
        return recurso.isPrestado();
    }

    public void getRecursosPrestados(){
        System.out.println("Los recursos que han sido prestados previamente son: ");
        System.out.println(this.recursosPrestados);
    }
}
