package servicio;

import entidad.Cadena;


public class ClaseServicio {

    String frase;

    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
     */
    public void mostrarVocales(Cadena c) {

        int cont = 0;
        for (int i = 0; i < c.getLongfrase(); i++) {
            frase = c.getFrase().substring(i, i + 1);
            if (frase.equalsIgnoreCase("a") || frase.equalsIgnoreCase("e") || frase.equalsIgnoreCase("i") || frase.equalsIgnoreCase("o") || frase.equalsIgnoreCase("u")) {
                cont++;
            }

        }
        System.out.println("La frase contine : " + cont + " vocales");
    }

    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena c) {
        StringBuilder builder = new StringBuilder(c.getFrase());
        builder.reverse();

        String fraseInvertida = builder.toString();

        System.out.println("La frase invertida es: " + fraseInvertida);

    }

    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo
     */
    public void vecesRepetido(String letra, Cadena c) {
        int cont = 0;
        for (int i = 0; i < c.getLongfrase(); i++) {
            frase = c.getFrase().substring(i, i + 1);
            if (frase.equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra se encuentra : " + cont + " veces en la frase.");
    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
    compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(String frase2, Cadena c) {
        int longFrase2 = frase2.length();
        c.getLongfrase();
        int resultado = frase2.compareTo(frase);
        if (resultado < 0) {
            System.out.println("La frase ingresada es menor que la existente :");

        } else if (resultado == 0) {
            System.out.println("La frase ingresada es igual que la existente :");
        } else {
            System.out.println("La frase ingresada es menor que la existente :");
        }

    }
    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrase(String frase2, Cadena c){
        String unir = c.getFrase().concat(frase2);
        System.out.println(unir);
    }
    
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    mostrar la frase resultante.
    */
public void remplazar(String car , Cadena c){
    String fraseNueva =c.getFrase().replace("a",car);
    System.out.println(fraseNueva);
}    
/*
Método contiene(String letra), deberá comprobar si la frase contiene una letra
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
public boolean contine ( String letra , Cadena c){
    return c.getFrase().contains(letra);
    
}

}


