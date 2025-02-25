/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo;

/**
 *
 * @author Yasmn
 */
public class Circulo {
    double raio;
    double area; 
    double perimetro;

    // Construtor que inicializa o raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public void calcularArea() {
        area = Math.PI * Math.pow(raio, 2); 
    }

    // Método para calcular o perímetro do círculo
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * raio; 
    }

    // Método para exibir os resultados
    public void exibirResultados() {
        calcularArea();
        calcularPerimetro();
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
