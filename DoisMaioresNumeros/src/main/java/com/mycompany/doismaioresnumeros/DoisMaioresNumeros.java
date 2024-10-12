/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doismaioresnumeros;
import java.util.Scanner;
/**
 *
 * @author Monike Oliveira
 */
public class DoisMaioresNumeros {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int maior = Integer.MIN_VALUE; // Inicializa o maior com o menor valor possível
            int segundoMaior = Integer.MIN_VALUE; // Inicializa o segundo maior com o menor valor possível
            int i = 1;
            
            // Laço while para solicitar 10 números
            while (i <= 10) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = scanner.nextInt();
                
                // Atualiza os maiores números
                if (numero > maior) {
                    segundoMaior = maior; // O maior anterior se torna o segundo maior
                    maior = numero; // O novo número é o maior
                } else if (numero > segundoMaior) {
                    segundoMaior = numero; // Atualiza o segundo maior se necessário
                }
                
                i++;
            }
            
            // Exibe os dois maiores números
            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("O segundo maior número digitado foi: " + segundoMaior);
        } // Inicializa o maior com o menor valor possível
    }
}

