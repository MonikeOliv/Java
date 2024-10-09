/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabeladequadrados;

import java.util.Scanner;

/**
 *
 * @author Monike
 */

import java.util.Scanner;

public class TabelaDeQuadrados {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de quadrados até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i + "² = " + (i * i));
        }
    }
    }
}
