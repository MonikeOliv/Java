/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospedes;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main (String[]args){
        
        //instanciando o objeto: Hospede
        Hospedes hospede1 = new Hospedes();
        
        //declarando valores dos atributos:
        hospede1.nome = "Selma";
        hospede1.email = "Selma@gmail.com";
        hospede1.telefone = "1199999999";
        hospede1.valorDiaria = 200;
        hospede1.quantidadeDeDias = 3;
        hospede1.dataCheckin = "01/03/2025";
        hospede1.dataCheckout = "04/03/2025";
        
           
        //chamando os metodos:
        hospede1.exibirInformações();
    }
    
}
