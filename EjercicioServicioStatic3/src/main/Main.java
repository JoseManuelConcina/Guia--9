package main;

import java.util.Arrays;
import service.ArregloService;

public class Main {
    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];
    
        ArregloService as = new ArregloService();
        ArregloService.inicializarA(arrayA);
        ArregloService.mostrar(arrayA);
        ArregloService.ordenar(arrayA);
        ArregloService.inicializarB(arrayB, arrayA);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println("-------------------------------------------------------------------------");
    }
}
