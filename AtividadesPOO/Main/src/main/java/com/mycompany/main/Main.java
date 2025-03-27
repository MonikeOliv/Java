/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Monike Oliveira
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pessoa ===");
        Pessoa pessoa = new Pessoa("Ana Souza", "123.456.789-00", "01/01/1990");
        pessoa.exibirInformacoes();

        System.out.println("\n=== Aluno ===");
        Aluno aluno = new Aluno("Carlos Lima", "987.654.321-00", "05/03/2001", "202312345", "Engenharia de Software");
        aluno.exibirInformacoes();

        System.out.println("\n=== Professor ===");
        Professor professor = new Professor("Luciana Ribeiro", "456.123.789-11", "15/09/1980", "Matemática", "RF998877");
        professor.exibirInformacoes();

        System.out.println("\n=== Funcionário ===");
        Funcionario funcionario = new Funcionario("João Pedro", "321.789.654-00", "22/11/1975", "Secretária", "RGM554433");
        funcionario.exibirInformacoes();
    }
}

