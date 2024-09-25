/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv3 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double salario;
        
        System.out.print("Digite o seu salário: ");
        salario = ler.nextDouble();
        
        if (salario > 6600.0)
        {
            System.out.println("O salario e maior que 5 vezes o salario minimo.");
        } else
        {
            System.out.println("O salario nao e maior que 5 vezes o salario minimo.");
        }
    }
}
