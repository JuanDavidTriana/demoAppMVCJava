
import controller.TaskControllers;

public class App {
    public static void main(String[] args) {
        TaskControllers controlador = new  TaskControllers();

        controlador.agegarTarea("Estudiar Java");
        controlador.agegarTarea("Estudiar Spring Boot");
        controlador.agegarTarea("Estudiar POO");

        controlador.mostrarTareas();

        controlador.completarTarea(1);

        controlador.mostrarTareas();
    }
}
