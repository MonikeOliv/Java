/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaraten;
import java.util.Scanner;
/**
 *
 * @author Monike Oliveira
 */
public class ContarAten {
    public static void main(String[] args) {
        // Solicita o número N
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita o número N
            System.out.print("Digite um número inteiro N: ");
            int N = scanner.nextInt();
            
            // Laço para imprimir todos os números de 1 até N
            int i = 1;
            while (i <= N) {
                System.out.println(i);
                i++;
            }
        }
    }
}

