/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetowhile;

import java.util.Scanner;
/**
 *
 * @author Monike Oliveira
 */
public class ProjetoWhile {
    public static void main(String[] args) {
        // Pergunta quantos alunos tem na sala
        try (Scanner scanner = new Scanner(System.in)) {
            // Pergunta quantos alunos tem na sala
            System.out.print("Quantos alunos há na sala? ");
            int quantidadeAlunos = scanner.nextInt();
            
            double somaNotas = 0;
            
            // Laço while para receber as notas dos alunos
            int i = 1;
            while (i <= quantidadeAlunos) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota; // Soma as notas
                i++;
            }
            
            // Calcula a média
            double media = somaNotas / quantidadeAlunos;
            
            // Exibe a média aritmética
            System.out.println("A média da turma é: " + media);
        }
    }
}


