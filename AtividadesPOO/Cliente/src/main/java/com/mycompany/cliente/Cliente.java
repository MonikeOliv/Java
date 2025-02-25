/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cliente;

/**
 *
 * @author Monike
 */
public class Cliente {
    
    String nome;
    String email;
    String telefone;
    String compratotal;
    double pedido1, pedido2, pedido3;
    
    //Metodo comprar
  double calcularCompra(){
     return pedido1 + pedido2 + pedido3;
    }
  
  //Metedo exebir informações
  void exibirInformações(){
      System.out.println("Nome do cliente" + nome);
      System.out.println("O valor total de compra é:" + calcularCompra());
  }
  
    
}
