/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadornumeros;

import java.util.Scanner;

/**
 *
 * @author Monike/Oliv
 */
public class ContadorNumeros {

 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         int contador = 0;
         int numero;
         
         System.out.println("Insira números inteiros (digite 0 para sair):");
         
         do {
             numero = scanner.nextInt();
             if (numero != 0) {
                 contador++;
             }
         } while (numero != 0);
         
         System.out.println("Você inseriu " + contador + " números.");
     }
    }
}
