/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposveiculos;

/**
 *
 * @author Admin
 */
public class Veiculo {
    String modelo;
    String cor;
    int velocidade;

    public Veiculo(String modelo, String cor, int velocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    public void acelerar(int incremento) {
        System.out.println("Estava a " + velocidade + "km/h" + "e acelerei mais " + incremento + ".Ficando com " + (velocidade+incremento) + "km/h");
        
    }
    
    public void freiar(int decremento){
        System.out.println("Estava a " + velocidade + "km/h" + "e resuzi " + decremento + ".Ficando  " + (velocidade-decremento) + "km/h");
        
    }
    
    public void exibirInformacao(){
        System.out.println("O carro " + modelo + " da cor " + cor + " esta a " + velocidade + "km/h");
        
    }
}
