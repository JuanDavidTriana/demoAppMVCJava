package controller;

import java.util.ArrayList;
import java.util.List;
import model.TaskModel;
import view.TaskView;

public class TaskControllers {
    private List<TaskModel> tareas = new ArrayList<>();
    private TaskView vista = new TaskView();

    public void agegarTarea(String nombre){
        tareas.add(new TaskModel(nombre));
    }

    public void completarTarea(int indice){
        indice --;
        if (indice >= 0 && indice < tareas.size()){
            tareas.get(indice).completar();
        }
    }

    public void mostrarTareas(){
        vista.mostrarTareas(tareas);
    }

}
