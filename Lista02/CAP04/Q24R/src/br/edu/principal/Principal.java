package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double preco, valorAdicional=0, imposto, precoCusto, desconto, novoPreco;

		String tipo, refrigeracao;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço: ");
		preco = sc.nextDouble();
		
		System.out.print("Digite o tipo (A, L ou V): ");
		tipo = sc.next();
		
		System.out.print(" a refrigeração (S ou N): ");
		refrigeracao = sc.next();
		
        if (refrigeracao.equals("N")) {
            if (tipo.equals("A")) {
                if (preco < 15) {
                    valorAdicional = 2;
                }
                else {
                    valorAdicional = 5;
                }
            }
            else if (tipo.equals("L")) {
                if (preco < 10) {
                    valorAdicional = 1.5;
                }
                else {
                    valorAdicional = 2.5;
                }
            }
            else if (tipo.equals("V")) {
                if (preco < 30) {
                    valorAdicional = 3;
                }
                else {
                    valorAdicional = 2.5;
                }
            }
        }
        else {
            if (tipo.equals("A")) {
                valorAdicional = 8;
            }
            else if (tipo.equals("L") | tipo.equals("V")) {
                valorAdicional = 0;
            }
        }
        
        System.out.println("O valor adicional é: " + valorAdicional);
        
        if (preco < 25) {
            imposto = preco * 5/100;
        }
        else {
            imposto = preco * 8/100;
        }
        
        System.out.println("O imposto é: " + imposto);
        
        precoCusto = preco + imposto;
        System.out.println("O preço de custo é: " + precoCusto);
        
        if (!tipo.equals("A") && !refrigeracao.equals("S")) {
            desconto = precoCusto * 3/100;
        }
        else {
            desconto = 0;
        }
        
        System.out.println("o desconto é: " + desconto);
        
        novoPreco = precoCusto + valorAdicional - desconto;
        System.out.println("o novo preço é: " + novoPreco);
        
        if (novoPreco <= 50) {
            System.out.println("Barato");
        }
        else if (novoPreco < 100) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Caro");
        }
        
    }
    
}