/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo2;

/**
 *
 * @author Monike Oliveira
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Veículo ===");
        Veiculo2 v1 = new Veiculo2("Ford", "F-1000", 1985);
        v1.exibirInformacoes();

        System.out.println("\n=== Carro ===");
        Carro c1 = new Carro("Toyota", "Corolla", 2020, "Gasolina");
        c1.exibirInformacoes();

        System.out.println("\n=== Carro Elétrico ===");
        CarroEletrico ce1 = new CarroEletrico("Tesla", "Model S", 2023, "Elétrico", 100.0);
        ce1.exibirInformacoes();
    }
}

    

