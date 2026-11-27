import java.util.ArrayList;
public class GestorTareas {

    private ArrayList<String> tareas = new ArrayList<>();

  /**
   * Añade una nueva tarea a la lista de tareas.
   *
   * @param tarea representa la descripción de la tarea que se quiere añadir.
   *
   * No devuelve ningún valor.
   * No hace comprobaciones.
   */
    // METODO 1
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea añadida: " + tarea);
    }


    // METODO AUXILIAR - NO DOCUMENTAR
    public void vaciarTareas() {
        tareas.clear();
    }

  /**
   * Muestra todas las tareas almacenadas en la lista.
   *
   * No recibe ningún parámetro.
   *
   * No devuelve ningún valor porque es un método void.
   *
   * Comprueba si la lista está vacía mediante tareas.isEmpty().
   * Si está vacía muestra un mensaje indicando que no hay tareas pendientes.
   * Si contiene tareas recorre la lista y muestra cada tarea junto a su posición.
   */
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
