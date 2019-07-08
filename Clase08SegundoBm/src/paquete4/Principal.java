/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Scanner;

/**
 *
 * @author Sant Garcia
 */
public class Principal {
    public static void main(String[] args) {
        int base ;
        int exponente ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = entrada.nextInt();
        System.out.println("Ingrese el exponente");
        exponente = entrada.nextInt();
        int expo = Potencia.get_potencia(base, exponente);
        System.out.printf("Potencia:%d ", expo);
    }
}
