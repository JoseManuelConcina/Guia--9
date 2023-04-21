package entidad;

public class Ahorcado {

    private String[] palabraABuscar ;
    private int cantidadLetras;
    private int cantidadIntentos ;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int cantidadLetras, int cantidadIntentos) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadLetras = cantidadLetras;
        this.cantidadIntentos = cantidadIntentos;

    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

}
