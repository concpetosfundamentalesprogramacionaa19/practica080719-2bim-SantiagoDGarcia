/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author Sant Garcia
 */
public class Principal {
    public static void main(String[] args) {
        int v ;
        Scanner entrada = new Scanner(System.in);
        v = entrada.nextInt();
        int suma = SumaNumeros.ObtenerSumaUno(v);
        int suma2 = SumaNumeros.ObtenerSumaDos(v) ;
        System.out.printf("Suma: %d, Suma2: %d", suma, suma2);
    }
}
