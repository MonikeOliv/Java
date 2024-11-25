/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaemvetor;

import java.util.Scanner;

/**
 *
 * @author MonikOliv
 */


public class BuscaEmVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        // Solicitar 10 nomes ao usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Solicitar nome a ser buscado
        System.out.print("Digite o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        // Buscar o nome no vetor
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeBusca)) {
                System.out.println("O nome '" + nomeBusca + "' foi encontrado na posição " + i + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado.");
        }
    }
}

