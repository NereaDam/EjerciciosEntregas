package SistemaDeVehiculos;

import java.util.Scanner;

public class EntrasdaSalida {

    public static void dameLitros(){
        Scanner read = new Scanner(System.in);
        imprimir("Inserta los litros de tu deposito");
        int litro= read.nextInt();
    }


    public static void imprimir(String frase){
        System.out.println(frase);
    }

}
