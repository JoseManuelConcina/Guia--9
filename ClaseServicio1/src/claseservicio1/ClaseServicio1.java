package claseservicio1;

import entidad.Cadena;
import java.util.Scanner;
import servicio.ClaseServicio;

public class ClaseServicio1 {

    public static void main(String[] args) {
        Cadena c = new Cadena("casa blanca");
        ClaseServicio cs = new ClaseServicio();

        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        cs.vecesRepetido(letra, c);
        System.out.println("--------------------------------------");
        System.out.println("Ingrese una nueva frase");
        String frase2 = leer.nextLine();
        cs.compararLongitud(frase2, c);
        cs.unirFrase(frase2, c);
        System.out.println("---------------------------------------");
        System.out.println("Ingrese un caracter");
        String car = leer.next();
        cs.remplazar(car, c);

    }

}
