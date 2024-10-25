/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

import java.util.Scanner;

/**
 *
 * @author Monike Oliveira
 */
public class Tabuada {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        int contador = 1;

        System.out.println("Tabuada do " + numero + ":");
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }
    }
    }
}
