/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu;
import java.util.Scanner;
/**
 *
 * @author Monike Oliveira
 */
public class Menu {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Você escolheu Adicionar.");
                case 2 -> System.out.println("Você escolheu Remover.");
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
    }
}
