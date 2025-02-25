/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospedes;

/**
 *
 * @author Monike
 */
public class Hospedes {
    //Atributos
    String nome;
    String email;
    String telefone;
    double valorDiaria;
    int quantidadeDeDias;
    double valorTotal;
    String dataCheckin;
    String dataCheckout;
    

    //Metodos (Somar o valor total da estadia)
    
    double calcularEstadia(){
        return (valorDiaria * quantidadeDeDias); // Realiza o cálculo corretamente
    }
    
    // Método para exibir as informações do hóspede
    void exibirInformações(){
        System.out.println("nome do hospede " + nome);
        System.out.println("valor da diaria " + valorDiaria);
        System.out.println("data check-in " + dataCheckin);
        System.out.println("data check-out " + dataCheckout);
        System.out.println("O valor total das diarias é: R$ " + calcularEstadia());
    }
}
