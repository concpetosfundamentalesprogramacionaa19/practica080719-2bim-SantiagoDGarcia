/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Sant Garcia
 */
public class SizeArreglo {
    // Metodo recursivo para obtener los datos
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
    }
    // Metodo para obtener tamaño de arreglo mediante for
    public static int obtenerTamArreglo2(int arreglo2[], int tamanio) {
        int suma = 0; 
        for (int i = 0; i < tamanio; i++) {
            suma = suma + arreglo2[i];
        }return suma;
    }
}
