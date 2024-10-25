/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaotemperatura;

import java.util.Scanner;
/**
 *
 * @author Monike Oliveira
 */
public class ConversaoTemperatura {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double celsius;
            
            do {
                System.out.print("Insira a temperatura em Celsius (0 para sair): ");
                celsius = scanner.nextDouble();
                
                if (celsius != 0) {
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);
                }
            } while (celsius != 0);
            
            System.out.println("Programa encerrado.");
        }
    }
}
