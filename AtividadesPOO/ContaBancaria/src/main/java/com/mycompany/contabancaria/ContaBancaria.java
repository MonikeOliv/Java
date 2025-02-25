/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author Yasmn
 */
class ContaBancaria {
    Cliente nomeCliente;  
    String numeroConta;
    String agencia;
    double saldo;

    // Construtor com o parâmetro renomeado
    public ContaBancaria(Cliente nomeCliente, String numeroConta, String agencia, double saldoInicial) {
        nomeCliente = nomeCliente;  
        numeroConta = numeroConta;
        agencia = agencia;
        saldo = saldoInicial;
        System.out.println("Conta criada para " + nomeCliente.nome);  // Acessando o nome diretamente
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado! Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado! Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo de : R$" + saldo);
    }
}
