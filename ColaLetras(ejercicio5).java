/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA_EJERCICIOS;

/**
 *
 * @author Mustang
 */
import java.util.PriorityQueue;

public class ColaLetras {
    private PriorityQueue<Character> cola;

    public ColaLetras() {
        cola = new PriorityQueue<>();
    }

    public void insertar(String secuencia) {
        for (char letra : secuencia.toCharArray()) {
            if (cola.contains(letra)) {  // Si la letra ya está en la cola, no la agregamos de nuevo
                continue;
            }
            cola.offer(letra);  // Agregamos la letra a la cola de prioridad
        }
    }

    public void mostrar() {
        while (!cola.isEmpty()) {
            System.out.print(cola.poll());
        }
    }
}



