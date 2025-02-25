/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefa;

/**
 *
 * @author Selma
 */
public class Tarefa {

      // Atributos
    String nome;
    String descricao;
    String prazoConclusao;
    boolean concluida;

    // Método para definir as informações da tarefa
    void definirInformacoes(String n, String d, String p) {
        nome = n;
        descricao = d;
        prazoConclusao = p;
        concluida = false; // Por padrão, começa como pendente
    }

    // Método para exibir as informações da tarefa
    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazoConclusao);
        System.out.println("Status: " + (concluida ? "Concluída" : "Pendente"));
    }

    // Método para concluir a tarefa
    void concluirTarefa() {
        concluida = true;
        System.out.println("A tarefa '" + nome + "' foi concluída.");
    }
}