/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposveiculos;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo {
    
    int numeroPortas;
    
    public Carro(String modelo, String cor, int velocidade, int numeroPortas) {
        super(modelo, cor, velocidade);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInformacao(){
        System.out.println("O carro " + modelo + " da cor " + cor + " esta a " + velocidade + "km/h. E contem " + numeroPortas+ " Portas .");
    }   
     
}
