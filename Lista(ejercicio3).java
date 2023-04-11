public class Lista {

    private int[] elementos;
    private int tamano;

    public Lista(int capacidad) {
        elementos = new int[capacidad];
        tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public int getElemento(int indice) {
        return elementos[indice];
    }

    public void agregar(int elemento) {
        if (tamano < elementos.length) {
            elementos[tamano] = elemento;
            tamano++;
        }
    }

    public void ordenar() {
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = i + 1; j < tamano; j++) {
                if (elementos[i] > elementos[j]) {
                    int temp = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = temp;
                }
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamano; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

class Pilas {

    private int[] elementos;
    int tope;

    public int getTope() {
        return tope;
    }

    public Pilas(int capacidad) {
        elementos = new int[capacidad];
        tope = -1;
    }

    public void push(int elemento) {
        if (tope < elementos.length - 1) {
            tope++;
            elementos[tope] = elemento;
        }
    }

    public int pop() {
        if (tope >= 0) {
            int elemento = elementos[tope];
            tope--;
            return elemento;
        }
        return -1;
    }

    public void retirar(int valor) {
        Pilas temporal = new Pilas(elementos.length);
        while (tope >= 0) {
            int elemento = pop();
            if (elemento != valor) {
                temporal.push(elemento);
            }
        }
        while (temporal.tope >= 0) {
            push(temporal.pop());
        }
    }

    public void imprimir() {
        for (int i = tope; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

class Cola {

    private int[] elementos;
    private int frente;
    private int fin;

    public Cola(int capacidad) {
        elementos = new int[capacidad];
        frente = -1;
        fin = -1;
    }

    public void encolar(int elemento) {
        if (fin < elementos.length - 1) {
            fin++;
            elementos[fin] = elemento;
            if (frente == -1) {
                frente = 0;
            }
        }
    }

    public int desencolar() {
        if (frente != -1) {
            int elemento = elementos[frente];
            if (frente == fin) {
                frente = -1;
                fin = -1;
            } else {
                frente++;
            }
            return elemento;
        }
        return -1;
    }

    public void imprimir() {
        for (int i = frente; i <= fin; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public void agregarRepetidos(Pilas pila, int valor) {
        if (pila.tope >= 0) {
            int elemento = pila.pop();
            agregarRepetidos(pila, valor);
            if (elemento == valor) {
                encolar(elemento);
            }
            pila.push(elemento);
        }
    }
}
