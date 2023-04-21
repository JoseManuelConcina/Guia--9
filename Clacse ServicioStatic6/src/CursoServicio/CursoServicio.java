package CursoServicio;

import entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
    el nombre de cada alumno.
     */
    public static String[] cargarAlumno() {
        Scanner leer = new Scanner(System.in);
        String vector[] = new String[5];
        String nombre = "";
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el nombre del alumno numero " + (i + 1));
            nombre = leer.next();
            vector[i] = nombre;
        }

        return vector;
    }

    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos 
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al
    atributo alumnos
     */
    public static Curso crearCurso() {
        String[] alumnos = CursoServicio.cargarAlumno();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso :");
        String Curso = leer.next();
        System.out.println("Ingrese las cantidad de horas :");
        int CantidadHorasPorDias = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias : ");
        int CantidadDiasPorSemanas = leer.nextInt();
        System.out.println("Ingrese el turno : ");
        String Turno = leer.next();
        System.out.println("Ingrese ingrese el valor de la horas :");
        double PrecioPorHora = leer.nextDouble();
        return new Curso(Curso, CantidadHorasPorDias, CantidadDiasPorSemanas, Turno, PrecioPorHora, alumnos);
    }

    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
    que se repite el encuentro
     */
    public static double calcularGananciaSemanal(Curso curso) {
        double calculoSemanal = curso.getCantidadHorasPorDias() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasPorSemanas();
        System.out.println("El calculo semanal:  " + calculoSemanal + " pesos");
        return calculoSemanal;
    }
}
