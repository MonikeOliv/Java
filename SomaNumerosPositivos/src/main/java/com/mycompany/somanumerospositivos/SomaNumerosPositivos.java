/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somanumerospositivos;

import java.util.Scanner;

/**
 *
 * @author Monike Oliveira
 */
public class SomaNumerosPositivos {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int soma = 0;

        while (true) {
            System.out.print("Insira um número inteiro (negativo para sair): ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }

        System.out.println("A soma dos números positivos é: " + soma);
    }
    }
}