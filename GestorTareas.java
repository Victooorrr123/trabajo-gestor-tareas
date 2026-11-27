import java.util.ArrayList;
public class GestorTareas {

    private ArrayList<String> tareas = new ArrayList<>();

    // METODO 1
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea añadida: " + tarea);
    }


    // METODO AUXILIAR - NO DOCUMENTAR
    public void vaciarTareas() {
        tareas.clear();
    }


    // METODO 2 
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println(i + " - " + tareas.get(i));
            }
        }
    }


    // METODO 3
    public boolean buscarTarea(String tarea) {
        return tareas.contains(tarea);
    }


    // METODO 4 
    public boolean estaVacia() {
        return tareas.isEmpty();
    }


    // METODO 5
    public void eliminarTarea(int posicion) {
        if (posicion >= 0 && posicion < tareas.size()) {
            tareas.remove(posicion);
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("Posición no válida.");
        }
    }


    // METODO 6
    public int contarTareas() {
        return tareas.size();
    }
}
