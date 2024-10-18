/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemregressiva;

/**
 *
 * @author Monike/Oliv
 */
public class ContagemRegressiva {

 public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Feliz Ano Novo!");
    }
}
