package view;

import java.util.List;
import model.TaskModel;

public class TaskView {
    public void mostrarTareas(List<TaskModel> tareas){
        System.out.println("=== Lista de Tareas ===");
        int aux = 1;
        for (TaskModel t : tareas) {
            String estado = t.isCompletado() ? "[X]" : "[ ]";
            System.out.println(aux + ". "+estado + " " + t.getNombre());
            aux ++;
        }
    }
}
