/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares;
import java.util.Scanner;

/**
 *
 * @author Monike Oliveira
 */
public class NumerosPares {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();
        int contador = 1;

        System.out.println("Números pares de 1 a " + n + ":");
        while (contador <= n) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
    }
}