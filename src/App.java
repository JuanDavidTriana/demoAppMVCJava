
import controller.TaskControllers;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        TaskControllers controlador = new  TaskControllers();

        controlador.agegarTarea("Estudiar Java");
        controlador.agegarTarea("Estudiar Spring Boot");
        controlador.agegarTarea("Estudiar POO");

        controlador.mostrarTareas();

        controlador.completarTarea(1);

        controlador.mostrarTareas();

        int [] numeros = {1,2,3,4};
        
        System.out.println(numeros.length);

        String texto = "Hola";
        System.out.println(texto.length());

        ArrayList<Boolean> lista = new  ArrayList<>();

        lista.add(true);
        lista.add(true);
        lista.add(true);
        lista.add(false);

        System.out.println(lista.size());
    }
}
