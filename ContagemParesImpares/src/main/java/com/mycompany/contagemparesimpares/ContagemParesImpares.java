/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemparesimpares;

import java.util.Scanner;

/**
 *
 * @author MonikeOliv
 */
public class ContagemParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int pares = 0;
        int impares = 0;

        // Solicitar 15 números inteiros
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Contar números pares e ímpares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibir resultados
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
