/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;

/**
 *
 * @author Monike
 */
public class Main {
    public static void main (String[]args){
        
    //instanciando o objeto:
    Cliente cliente1 = new Cliente();
    
    //declarando valores aos atributos:
    cliente1.nome = "Monike";
    cliente1.email = "monike17gon@gmail.com";
    cliente1.telefone = "11977758245";
    cliente1.pedido1 = 10;
    cliente1.pedido2 = 20;
    cliente1.pedido3 = 30;
    
    //chamando os metodos:
    cliente1.calcularCompra();
    cliente1.exibirInformações();
    }
   
}