/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author Monike
 */
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número de 1 a 10: ");
            int numero = scanner.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido! Informe um número entre 1 e 10.");
            } else {
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
        }
    }
}

