/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
/**
 *
 * @author Sant Garcia
 */
public class SumaNumeros {
    public static int ObtenerSumaUno(int v) {
        int suma = 0;
        for (int i = 1; i <= v; i++) {
            suma = suma + i;
        }
        return suma;
    }
    public static int ObtenerSumaDos(int v) {
        if (v <= 0) {
            return 0;
        } else {
            return v+ObtenerSumaDos(v-1);
        }
    }

}
