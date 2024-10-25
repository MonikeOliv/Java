/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemregressiva;

import java.util.Scanner;

/**
 *
 * @author Monike Oliveira
 */
public class ContagemRegressiva {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int numero;

        do {
            System.out.print("Insira um número para contagem regressiva: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Contagem regressiva:");
                for (int i = numero; i >= 1; i--) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Por favor, insira um número positivo.");
            }
        } while (numero <= 0);
    }
    }
}
