/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenacaobubblesort;

import java.util.Random;

/**
 *
 * @author MonikeOliv
 */

public class OrdenacaoBubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[15];

        // Criar vetor com 15 números aleatórios
        for (int i = 0; i < 15; i++) {
            vetor[i] = random.nextInt(100) + 1; // Números de 1 a 100
        }

        System.out.print("Vetor original: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Algoritmo Bubble Sort
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Trocar os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Exibir vetor ordenado
        System.out.print("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
