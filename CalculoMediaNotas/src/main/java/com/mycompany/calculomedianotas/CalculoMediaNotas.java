/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculomedianotas;

import java.util.Scanner;

/**
 *
 * @author MonikeOliv
 */

public class CalculoMediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        // Solicitar 5 notas de alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcular a média das notas
        double media = soma / 5.0;

        // Contar alunos acima, abaixo e na média
        int acimaMedia = 0, abaixoMedia = 0, naMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        // Exibir resultados
        System.out.println("Média: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
        System.out.println("Alunos na média: " + naMedia);
    }
}

