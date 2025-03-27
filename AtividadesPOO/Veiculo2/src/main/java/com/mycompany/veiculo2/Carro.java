/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo2;

/**
 *
 * @author Monike Oliveira
 */

  public class Carro extends Veiculo2 {
    protected String tipoDeCombustivel;

    /**
     *
     * @param marca
     * @param modelo
     * @param ano
     * @param tipoDeCombustivel
     */
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Combustível: " + tipoDeCombustivel);
    }
}


