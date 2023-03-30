/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Mustang
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        

        CadenaXY cadena1 = new CadenaXY("OSOS&OSOS");
        CadenaXY cadena2 = new CadenaXY("ABBDYCA&ACYDBBA");

        System.out.println(cadena1.esFormaXY_Pila()); // Imprime false
        System.out.println(cadena1.esFormaXY_Cola()); // Imprime false
        System.out.println(cadena1.esFormaXY_Array()); // Imprime false

        System.out.println(cadena2.esFormaXY_Pila()); // Imprime true
        System.out.println(cadena2.esFormaXY_Cola()); // Imprime true
        System.out.println(cadena2.esFormaXY_Array()); // Imprime true

//        Lista lista = new Lista(5);
//        lista.agregar(3);
//        lista.agregar(3);
//        lista.agregar(1);
//        lista.agregar(4);
//        lista.agregar(2);
//
//        System.out.print("Lista sin ordenar: ");
//        for (int i = 0; i < lista.getTamano(); i++) {
//            System.out.print(lista.getElemento(i) + " ");
//        }
//        System.out.println();
//
//        lista.ordenar();
//
//        System.out.print("Lista ordenada: ");
//        for (int i = 0; i < lista.getTamano(); i++) {
//            System.out.print(lista.getElemento(i) + " ");
//        }
//        System.out.println();
//
//        Pilas pila = new Pilas(lista.getTamano());
//        for (int i = 0; i < lista.getTamano(); i++) {
//            pila.push(lista.getElemento(i));
//        }
//        
//        int valor =3 ;
//
//        System.out.print("Pila con los elementos de la lista ordenada: ");
//        pila.imprimir();
//
//        Cola cola = new Cola(5);
//        cola.agregarRepetidos(pila, valor);
//
//        System.out.print("Cola con los elementos iguales a 3 de la pila: ");
//        cola.imprimir();
//
//        pila.retirar(valor);
//        System.out.print("Pila con los elementos de la lista ordenada, sin el valor "+valor+": ");
//        pila.imprimir();
//        ColaU colaEstudiantes = new ColaU();
//        colaEstudiantes.addTicket("Juan");
//        colaEstudiantes.addTicket("Maria");
//        colaEstudiantes.addTicket("123");
//        colaEstudiantes.addTicket("Pedro");
//        colaEstudiantes.addTicket("Ana");
//        colaEstudiantes.mostrarCola();
//        colaEstudiantes.removeAll();
//        colaEstudiantes.mostrarCola();
//        colaEstudiantes.remove();
//        Pila[] pilas = new Pila[10];
//        for (int i = 1; i <= 9; i++) {
//            pilas[i] = new Pila();
//        }
//
//        pilas[0].apilar(1);
//        pilas[0].apilar(2);
//        pilas[0].apilar(3);
//        pilas[0].apilar(4);
//        pilas[0].apilar(5);
//        pilas[0].apilar(6);
//        pilas[0].apilar(7);
//        pilas[0].apilar(8);
//
//        pilas[1].apilar(9);
//        pilas[1].apilar(10);
//        pilas[1].apilar(11);
//        pilas[1].apilar(12);
//        pilas[1].apilar(13);
//        pilas[1].apilar(14);
//        pilas[1].apilar(15);
//        pilas[1].apilar(16);
//
//        Object datoB = 15;
//
//        for (int i = 0; i < 5; i++) {
//            if (pilas[i].buscar(datoB)) {
//                System.out.println("Se encontro el dato " + datoB + " en la pila " + i);
//            } else {
//                System.out.println("No se encontro el dato " + datoB + " en la pila " + i);
//            }
//        }
    }

}
