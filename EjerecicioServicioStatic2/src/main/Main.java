package main;

import entidad.ParDeNumero;
import servicio.ParDeNumeroServicio;

public class Main {

    public static void main(String[] args) {
        ParDeNumero pdn = new ParDeNumero();
      //  ParDeNumeroServicio serv = new ParDeNumeroServicio();
        
        ParDeNumeroServicio.mostratValor(pdn);
        ParDeNumeroServicio.devolverMayor(pdn);
        ParDeNumeroServicio.calcularPotencina(pdn,ParDeNumeroServicio.devolverMayor(pdn));
        ParDeNumeroServicio.calculaRaiz(pdn);
    }
}
