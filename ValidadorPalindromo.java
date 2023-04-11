/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA_EJERCICIOS;

/**
 *
 * @author Mustang
 */
import java.util.Stack;
import java.util.LinkedList;

public class ValidadorPalindromo {

    
   
    public static boolean esPalindromo(String cadena) {
        // Convertir la cadena a minúsculas y quitar los espacios en blanco
        cadena = cadena.toLowerCase().replaceAll("\\s", "");

        // Crear una pila y una cola
        Stack<Character> pila = new Stack<Character>();
        LinkedList<Character> cola = new LinkedList<Character>();

        // Agregar los caracteres de la cadena a la pila y a la cola
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            pila.push(c);
            cola.offer(c);
        }

        // Comparar los caracteres de la pila y de la cola
        while (!pila.isEmpty() && !cola.isEmpty()) {
            if (pila.pop() != cola.poll()) {
                return false;
            }
        }

        return true;
    }
}
