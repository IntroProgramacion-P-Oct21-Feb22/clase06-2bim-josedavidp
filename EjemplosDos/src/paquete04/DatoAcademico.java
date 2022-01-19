/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josed
 */
public class DatoAcademico {

    public static double[] obtenerNotas(int n) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Ingrese su nota: [%d]\n", i);
            notas[i] = entrada.nextDouble();
        }
        return notas;
    }
}


