package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    /*
     Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
     */
    public static Date fechaNacimiento(Date obj) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el año completo de su naciemento:  ");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes -1, dia);
        System.out.println(fecha);
        return fecha;

    }

    /*
    Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
     */
    public static Date fechaActual() {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        return fechaActual;
    }

    /*
    Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
     */
    public static void diferencia(Date fecha, Date fechaActual) {
        long diferencia =  fechaActual.getTime()-fecha.getTime() ; //cálculo de la diferencia en milisegundos
        long segundos = diferencia / 1000; //conversión de milisegundos a segundos
        long minutos = segundos / 60; //conversión de segundos a minutos
        long horas = minutos / 60; //conversión de minutos a horas
        long dias = horas / 24; //conversión de horas a días
        long anios = dias / 365;
        System.out.println("Usted tiene la edad de : " + anios + " años");
    }

}
