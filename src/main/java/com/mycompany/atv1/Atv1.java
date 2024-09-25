/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv1;


import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Atv1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada
        System.out.print("Valor total da fatura: R$ ");
        double valorTotal = ler.nextDouble();

        System.out.print("Número de parcelas: ");
        int numeroParcelas = ler.nextInt();

        System.out.print("Percentual de desconto por pagamento antecipado (%): ");
        double desconto = ler.nextDouble();

        System.out.print("Percentual de multa por atraso (%): ");
        double multa = ler.nextDouble();

        // Cálculo
        double valorComDesconto = valorTotal * (1 - desconto / 100);
        double valorParcelaComMulta = (valorTotal / numeroParcelas) * (1 + multa / 100);
        double valorMultaPorParcela = valorParcelaComMulta - (valorTotal / numeroParcelas);

        // Saída dos resultados
        System.out.printf("Valor total com desconto: R$ %.2f%n", valorComDesconto);
        System.out.printf("Valor de cada parcela com multa: R$ %.2f (Multa de R$ %.2f)%n", valorParcelaComMulta, valorMultaPorParcela);
    }
}
