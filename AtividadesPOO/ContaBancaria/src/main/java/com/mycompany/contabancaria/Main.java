/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author Yasmn
 */
public class Main {
    public static void main(String[] args) {
        // Inserindo as informações
        String nome = "Selma";  
        String numeroConta = "1234";    
        String agencia = "001";            
        double saldoInicial = 500.0;      

        // Criar o objeto Cliente
        Cliente nomeCliente = new Cliente(nome);

        // Criar a conta bancária
        ContaBancaria conta = new ContaBancaria(nomeCliente, numeroConta, agencia, saldoInicial);

        // Realizar operações
        conta.depositar(200);  
        conta.sacar(100);      
        conta.exibirSaldo();  
    }
}