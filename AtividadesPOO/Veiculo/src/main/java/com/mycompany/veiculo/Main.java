/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author Yasmn
 */
public class Main {
    public static void main(String[] args) {
        // Criando o veículo
        Veiculo veiculo = new Veiculo("C4", 100.00, 2);

        // Exibindo o valor total da locação
        veiculo.exibirValorTotal();
    }
}
