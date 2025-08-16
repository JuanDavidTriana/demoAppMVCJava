package model;

public class TaskModel {
    private String nombre;
    private boolean completada;

    // COSTRUCTOR

    public TaskModel(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    

    public boolean isCompletado() {
        return completada;
    }

    public void completar(){ 
        this.completada = true;
    }
    
}
