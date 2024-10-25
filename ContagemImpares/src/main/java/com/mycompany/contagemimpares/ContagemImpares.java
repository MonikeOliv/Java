/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemimpares;

import java.util.Scanner;

/**
 *
 * @author Monike Oliveira
 */
public class ContagemImpares {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int contadorImpares = 0;
            
            do {
                System.out.print("Insira um número inteiro (0 para sair): ");
                numero = scanner.nextInt();
                
                if (numero != 0 && numero % 2 != 0) {
                    contadorImpares++;
                }
            } while (numero != 0);
            
            System.out.println("Você inseriu " + contadorImpares + " números ímpares.");
        }
    }
}
