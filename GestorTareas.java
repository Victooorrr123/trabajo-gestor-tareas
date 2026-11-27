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
    /**
     *Comprueba si una tarea específica existe dentro de la lista
     *
     *@param tarea Nombre o descripción de la tarea que se desea buscar.
     *@return true si la tarea se encuentra en la lista, false en caso contrario.
     */
    public boolean buscarTarea(String tarea) {
        return tareas.contains(tarea);
    }


    // METODO 4
    /**
     *Verifica si la lista de tareas está completamente vacía.
     *
     *
     *@return true si no hay ninguna tarea almacenada, false si contiene al menos una.
     */
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
