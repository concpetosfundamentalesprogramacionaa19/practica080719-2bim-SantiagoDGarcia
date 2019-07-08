/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
import java.util.Scanner;

/**
 *
 * @author Sant Garcia
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables y matriz
        int tamanio ;
        int[] arreglo2 = {10, 20, 30, 1, 2, 3, 40, 4};
        // Entrada de datos 
        System.out.println("Ingrese el tamaño del arreglo (menor a 8)");
        tamanio = entrada.nextInt();
        // Importacion de metodos
        int tam = SizeArreglo.obtenerTamanioArreglo(arreglo2, tamanio);
        int tam2 = SizeArreglo.obtenerTamArreglo2(arreglo2, tamanio);
        System.out.printf("tamaño arreglo (Recursivo): %d\n"
                + "tamaño arreglo (FOR): %d ", tam ,tam2);
    }
}
