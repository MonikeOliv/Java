/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retangulo;

/**
 *
 * @author Yasmn
 */
public class Retangulo {
    double largura; 
    double altura;  
    double area;   
    double perimetro; 

    // Construtor que inicializa a largura e a altura
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    public void calcularArea() {
        area = largura * altura; 
    }

    // Método para calcular o perímetro do retângulo
    public void calcularPerimetro() {
        perimetro = 2 * (largura + altura); 
    }

    // Método para exibir os resultados
    public void exibirResultados() {
        calcularArea();
        calcularPerimetro();
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
