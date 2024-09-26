/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv6;

import java.util.Scanner;
/**
 *
 * @author Monike
 */
public class Atv6 {

public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o gênero (f/m): ");
        char genero = scanner.next().charAt(0);

        if (genero == 'f')
        {
            System.out.println("O gênero é feminino.");
        } 
        else
        {
            System.out.println("O gênero não é feminino.");
        }
}
}
