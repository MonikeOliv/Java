/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificacaosenha;

import java.util.Scanner;

/**
 *
 * @author Monile/Oliv
 */
public class VerificacaoSenha {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int senhaCorreta = 1234; // Defina a senha correta
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (senha != senhaCorreta);

        System.out.println("Senha correta! Acesso permitido.");
    } // Defina a senha correta
    }
}