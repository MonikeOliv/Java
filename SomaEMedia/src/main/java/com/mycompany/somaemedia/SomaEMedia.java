/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaemedia;

import java.util.Scanner;

/**
 *
 * @author MonikeOliv
 */

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        // Solicitar 10 números inteiros ao usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Calcular a média
        double media = soma / 10.0;

        // Exibir resultados
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
