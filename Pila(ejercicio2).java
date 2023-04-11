package ejercicio.pkg2;

/**
 *
 * @author Mustang
 */
public class Pila {
    
    private NodoPila cima;
    private int tamaño;

    public Pila() {
        cima = null;
        tamaño = 0;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void apilar(Object dato) {
        NodoPila nuevo = new NodoPila(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamaño++;
    }

    public Object desapilar() {
        if (esVacia()) {
            return null;
        }
        Object dato = cima.getDato();
        cima = cima.getSiguiente();
        tamaño--;
        return dato;
    }

    public Object cima() {
        if (esVacia()) {
            return null;
        }
        return cima.getDato();
    }

    public int tamaño() {
        return tamaño;
    }

    public boolean buscar(Object dato) {
        Pila auxiliar = new Pila();
        boolean encontrado = false;

        while (!esVacia() && !encontrado) {
            Object elem = desapilar();
            auxiliar.apilar(elem);
            if (elem.equals(dato)) {
                encontrado = true;
            }
        }

        while (!auxiliar.esVacia()) {
            apilar(auxiliar.desapilar());
        }

        return encontrado;
    }
    
    
}

class NodoPila {
    private Object dato;
    private NodoPila siguiente;

    public NodoPila(Object dato) {
        this.dato = dato;
        siguiente = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}
