
package service;

import java.util.Arrays;

public class ArregloService {
    /*
    Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
    */
    public static double [] inicializarA (double [] arrayA){
      Arrays.fill(arrayA, Math.random()*10);
      return arrayA;
    }
    /*
    Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
    */
    
    public static void mostrar (double [] arrayA){
        System.out.println(Arrays.toString(arrayA));
        
    }
    /*
    Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.

    */
    
    public static void ordenar (double [] arrayA){
     Arrays.sort(arrayA);
    }
    /*
    Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    */
    public static double [] inicializarB (double [] arrayB, double [] arrayA){
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        Arrays.fill(arrayB,10,20, 0.5);
        return arrayB;
    }
   
}
