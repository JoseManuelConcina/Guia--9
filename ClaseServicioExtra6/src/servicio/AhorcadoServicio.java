package servicio;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int letraEncontrada = 0;
    String palabra = "";
    int contadorLetra = 0;

    public void crearJuego(Ahorcado ahorcado) {
        System.out.println("Ingrese la palabra a adivinar");
        palabra = leer.next();
        String[] vector = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        ahorcado.setPalabraABuscar(vector);
        System.out.println("Ingrese la cantidad de jugadas maximas : ");
        ahorcado.setCantidadIntentos(leer.nextInt());
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra a adivinar es: " + palabra.length());
    }

    public void buscar(Ahorcado ahorcado, String letra) {

        int aux = 0;
        int cont = 0;

        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            cont++;
            if (letra.equalsIgnoreCase(ahorcado.getPalabraABuscar()[i])) {
                contadorLetra++;
            }

        }
        if (contadorLetra == 0) {
            System.out.println("La letra NO se encuentra en la palabra.");
        } else {
            System.out.println("La letra " + "*** " + letra + " ***" + " esta en la palabra");
            ahorcado.setCantidadLetras(contadorLetra);
        }

    }

    public void encontrar(Ahorcado ahorcado, String letra) {
        boolean bandera = false;

        ahorcado.setCantidadIntentos(ahorcado.getCantidadIntentos() - 1);
        int x = ahorcado.getCantidadIntentos() - ahorcado.getCantidadLetras();
        System.out.println("La cantidad de letras encontradas y la cantidad de letras que faltante es de"
                + "( " + ahorcado.getCantidadLetras() + " , " + x + " )");

    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("Le quedan la cantidad de: " + ahorcado.getCantidadIntentos() + " intentos.");

    }

    public void Juego(Ahorcado ahorcado) {
        Ahorcado as = new Ahorcado();
        int cont = 0;
       String letra;
        crearJuego(ahorcado);
        System.out.println("-----------------------------------------------");
        do {
            System.out.println("Ingrese una letra ");
            letra = leer.next();
            longitud(ahorcado);
            buscar(ahorcado, letra);
            encontrar(ahorcado, letra);
            intentos(ahorcado);
            System.out.println("-------------------------------------------------");
        } while (ahorcado.getCantidadIntentos() < 0 && ahorcado.getCantidadLetras()!=ahorcado.getPalabraABuscar().length);

    }

}
