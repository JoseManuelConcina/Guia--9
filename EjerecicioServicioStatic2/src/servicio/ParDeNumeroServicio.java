package servicio;

import entidad.ParDeNumero;

public class ParDeNumeroServicio {

    public static void mostratValor(ParDeNumero numero) {
        System.out.println("El primer numero es :  " + numero.getNum1());
        System.out.println("El primer segundo es :  " + numero.getNum2());
    }

    /*
    ) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
     */
    public static double devolverMayor(ParDeNumero numero) {
        double mayor;
        mayor = Math.max(numero.getNum1(), numero.getNum2());
        return mayor;
    }

    /*
    Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
     */
    public static void calcularPotencina(ParDeNumero numero, double devolverMayor) {
        double resultado;
        double menor = Math.min(numero.getNum1(), numero.getNum2());
        resultado = Math.pow(Math.round(devolverMayor), Math.round(menor));
        System.out.println("El resultado del calculo de la potencia es : " + resultado);
    }

    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número
     */

    public static void calculaRaiz(ParDeNumero numero) {
        double menor = Math.min(numero.getNum1(), numero.getNum2());
        double menorAbs = Math.abs(menor);
        double raiz = Math.sqrt(menorAbs);
        System.out.println("La raiz cuadrada del numero menor es :" + raiz);
    }
}
