/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Monike Oliveira
 */
 public class Funcionario extends Pessoa {
    private String cargo;
    private String rgm;

    public Funcionario(String nome, String cpf, String dataNascimento, String cargo, String rgm) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
        this.rgm = rgm;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: " + cargo);
        System.out.println("RGM: " + rgm);
    }
}
