/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposveiculos;

/**
 *
 * @author Admin
 */
public class TiposVeiculos {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Critoen C4 CACTUS", "PRETO", 150);
        System.out.println(v1.modelo + "  " +v1.cor + "  " + v1.velocidade + "km/h");
        Carro c1 = new Carro("Critoen C4 CACTUS", "PRETO", 150, 5);
        
        System.out.println("");
        System.out.println("*********************Classe Veiculo****************");
        System.out.println("");
        
        v1.acelerar(50);
        v1.freiar(20);
        v1.exibirInformacao();
        
        
        System.out.println("");
        System.out.println("*********************Classe Carro******************");
        System.out.println("");
        
        
        c1.acelerar(20);
        c1.freiar(5);
        c1.exibirInformacao();
    }
}
