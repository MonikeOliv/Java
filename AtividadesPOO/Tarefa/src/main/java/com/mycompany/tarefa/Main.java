/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa;

/**
 *
 * @author Selma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Criando uma tarefa
        Tarefa tarefa1 = new Tarefa();

        // Definindo as informações da tarefa
        tarefa1.definirInformacoes("Finalizar relatório", "Relatório trimestral de vendas", "30/03/2024");

        // Exibindo informações da tarefa
        tarefa1.exibirInformacoes();

        // Concluindo a tarefa
        tarefa1.concluirTarefa();

        // Exibindo novamente para ver o status atualizado
        tarefa1.exibirInformacoes();
    }
}
