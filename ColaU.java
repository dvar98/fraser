package ejercicio.pkg2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mustang
 */
public class ColaU {
    
    private Queue<String> cola = new LinkedList<String>();;
    
    public void addTicket(String ticket) {
        cola.add(ticket);
    }
    
    public void mostrarCola() {
        System.out.println("Cola de estudiantes:");
        for (String ticket : cola) {
            System.out.println(ticket);
        }
    }
    
    public void removeAll() {
        Queue<String> colados = new LinkedList<String>();
        while (!cola.isEmpty() && !cola.peek().matches("\\d+")) {
            colados.add(cola.poll());
        }
        System.out.println("Estudiantes colados:");
        for (String ticket : colados) {
            System.out.println(ticket);
        }
    }
    
    public void remove() {
        if (!cola.isEmpty() && cola.peek().matches("\\d+")) {
            String ticket = cola.poll();
            System.out.println("Se atendio al estudiante con el ticket: " + ticket);
        } else {
            System.out.println("No hay estudiantes en la cola con ticket.");
        }
    }
    
}
