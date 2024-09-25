/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv4;

import java.util.Scanner;

/**
 *
 * @author Monike
 */
public class Atv4 {

public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
        int parametro = 70;
        int peso;
        
        System.out.println("Qual é o seu peso: ");
        peso = ler.nextInt();
        
        if (peso > parametro)
        {
            System.out.println("Seu peso é maior do que 70Kg.");
        }
        else 
        {
            System.out.println("Seu peso é menor do que 70kg");
        }
    }
}
