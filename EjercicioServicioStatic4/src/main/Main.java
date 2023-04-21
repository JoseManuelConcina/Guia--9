
package main;

import java.util.Date;
import servicio.FechaService;
public class Main {
    public static void main(String[] args) {
        Date obj = new Date();
        FechaService fc = new FechaService ();
         
        FechaService.diferencia(FechaService.fechaNacimiento(obj), FechaService.fechaActual());
        
    }
}
