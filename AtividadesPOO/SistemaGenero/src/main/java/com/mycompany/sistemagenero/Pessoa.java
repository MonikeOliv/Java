/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagenero;

/**
 *
 * @author Admin
 */
public class Pessoa {
    
    String nome;
    String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
 public void sexoDescricao(){
     if(sexo.equalsIgnoreCase("F")){
         System.out.println("O sexo é Feminimo");
     } else if (sexo.equalsIgnoreCase("M")) {
         System.out.println("O seco é Masculino");
     } else if (sexo.equalsIgnoreCase(""))
         System.out.println("Sexo não foi definido");
    }
  public void exibirInformacao(){
     System.out.println("O meu nome é" +nome+ "e sou do sexo" +sexo+ "!");
  }

}
 