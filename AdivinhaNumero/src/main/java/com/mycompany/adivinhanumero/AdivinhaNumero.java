/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinhanumero;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Monike Oliveira
 */
public class AdivinhaNumero {
public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Adivinhe o número entre 1 e 100!");

        while (true) {
            System.out.print("Adivinhe o número: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Você acertou! O número era " + numeroSecreto + ".");
                System.out.println("Você fez " + tentativas + " tentativas.");
                break;
            }
        }
    }
    }
}
 