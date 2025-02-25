/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculo;

/**
 *
 * @author Yasmn
 */
public class Veiculo {

    String modelo;
    double diariaAluguel;
    int diasAluguel;

    // Atributos
    public Veiculo(String modelo, double diariaAluguel, int diasAluguel) {
        this.modelo = modelo;
        this.diariaAluguel = diariaAluguel;
        this.diasAluguel = diasAluguel;
    }

    // Método para calcular o total da locação
    public double calcularTotalLocacao() {
        return diariaAluguel * diasAluguel;
    }

    // Método para exibir o valor total da locação
    public void exibirValorTotal() {
        double total = calcularTotalLocacao();
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor diario de aluguel: R$ " + diariaAluguel);
        System.out.println("Dias de aluguel: " + diasAluguel);
        System.out.println("Valor total da locacao: R$ " + total);
    }
}
