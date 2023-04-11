
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Stack;
/**
 *
 * @author mustang
 */

public class ClimaEjercicio6 {
   private static ArrayList<Integer>registro = new ArrayList<>();
   private static Stack<Integer> temperaturas = new Stack<>();

    public static void main(String[] args) {
        int ndatos = 4;
        int mes_filtro=1;
        
       Random rand = new Random();
       
       for (int i = 0; i < ndatos; i++) {
            int mes = rand.nextInt(12) + 1;
            int semana = rand.nextInt(4) + 1;
            int dia = rand.nextInt(7) + 1;
            int temperatura = rand.nextInt(40) + 1;
            
           registro.add(mes);
           registro.add(semana);
           registro.add(dia);
           registro.add(temperatura);
           
        }      
       
        filtrarTemperatura(mes_filtro);
        System.out.println(registro.toString());

        System.out.println("Promedio de temperatura para el mes " + mes_filtro + " es de: " + calcularPromedio());
           
            


        
    }
    

    
    public static void filtrarTemperatura(int mes) {
    

    for (int i = 0; i < registro.size(); i += 4) {
        int mesRegistro = registro.get(i);
        if (mesRegistro == mes) {
            int temperatura = registro.get(i + 3);
            temperaturas.push(temperatura); 
            
        }
    }

}   
  public static float calcularPromedio() {
    float acumulador = 0;
    int contador = 0;
    
    while (!temperaturas.isEmpty()) {
        int temperatura = temperaturas.pop();
        acumulador += temperatura;
        contador+=1;
    }

    float promedio = 0;
    if (contador > 0) {
        promedio = acumulador / contador;
    }

    return promedio;
}
    
    
}
