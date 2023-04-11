package ejercicio.pkg2;

import java.util.NoSuchElementException;

/**
 *
 * @author Mustang
 */
public class PilaO<T> {
    

    private Nodo<T> cabeza;
    private int tamaño;

    public PilaO() {
        cabeza = null;
        tamaño = 0;
    }

    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato, cabeza);
        cabeza = nuevoNodo;
        tamaño++;
    }

    public T pop() {
        if (cabeza == null) {
            throw new NoSuchElementException("La pila está vacía");
        }
        T dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        tamaño--;
        return dato;
    }

    public T peek() {
        if (cabeza == null) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return cabeza.getDato();
    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    public int size() {
        return tamaño;
    }

    public boolean buscar(T dato) {
        PilaO<T> pilaAux = new PilaO<>();
        boolean encontrado = false;
        while (!isEmpty()) {
            T elemento = pop();
            if (elemento.equals(dato)) {
                encontrado = true;
            }
            pilaAux.push(elemento);
        }
        while (!pilaAux.isEmpty()) {
            push(pilaAux.pop());
        }
        return encontrado;
    }

    public void mostrar() {
        PilaO<T> pilaAux = new PilaO<>();
        System.out.print("[");
        while (!isEmpty()) {
            T dato = pop();
            System.out.print(dato);
            if (!isEmpty()) {
                System.out.print(", ");
            }
            pilaAux.push(dato);
        }
        System.out.println("]");
        while (!pilaAux.isEmpty()) {
            push(pilaAux.pop());
        }
    }

    private static class Nodo<T> {

        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato, Nodo<T> siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }

        public T getDato() {
            return dato;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }
    }
}

    

