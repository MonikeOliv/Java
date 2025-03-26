/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaveiculo;

/**
 *
 * @author Admin
 */
public class SistemaVeiculo {

    public static void main(String[] args) {
        Carro c1 = new Carro("C4 CACTUS CITROEN", "BRANCA", 120);
        System.out.println("O Carro modelo: " + c1.modelo  +  ", de cor"   + c1.cor + " está a " + c1.velocidade + "KM/H");
    }
}
