/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Mustang
 */
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class CadenaXY {
    private String cadena;

    public CadenaXY(String cadena) {
        this.cadena = cadena;
    }

    public boolean esFormaXY_Pila() {
        Stack<Character> pila = new Stack<Character>();
        int i = 0;
        while (cadena.charAt(i) != '&') {
            pila.push(cadena.charAt(i));
            i++;
        }
        i++;
        while (i < cadena.length()) {
            if (cadena.charAt(i) != pila.peek()) {
                return false;
            }
            pila.pop();
            i++;
        }
        return pila.isEmpty();
    }

    public boolean esFormaXY_Cola() {
        Queue<Character> cola = new LinkedList<Character>();
        int i = 0;
        while (cadena.charAt(i) != '&') {
            cola.offer(cadena.charAt(i));
            i++;
        }
        i++;
        while (i < cadena.length()) {
            if (cadena.charAt(i) != cola.peek()) {
                return false;
            }
            cola.poll();
            i++;
        }
        return cola.isEmpty();
    }

    public boolean esFormaXY_Array() {
        char[] cadenaArray = cadena.toCharArray();
        int tam = cadenaArray.length;
        int mitad = tam / 2;
        for (int i = 0; i < mitad; i++) {
            if (cadenaArray[i] != cadenaArray[tam - i - 2]) {
                return false;
            }
        }
        return (cadenaArray[mitad] == '&');
    }
}

