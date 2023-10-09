package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int codeProduto, codePais;
		
		double pesoQuilos, pesoGramas, precoGramas=0, precoTotal, precoFinal, imposto=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o código do produto: ");
		codeProduto = sc.nextInt();
		
		System.out.print("Digite o peso em quilos: ");
		pesoQuilos = sc.nextDouble();
		
		System.out.print("Digite o código do país: ");
		codePais = sc.nextInt();
		
		pesoGramas = pesoQuilos * 1000;
		System.out.println("O peso do produto em gramas é: " + pesoGramas);
		
		
		if ((codeProduto >= 1) & (codeProduto <= 4)) {
			precoGramas = 10;
		}
		else if ((codeProduto >= 5) & (codeProduto <= 7)) {
			precoGramas = 25;
		}
		else if ((codeProduto >= 8) & (codeProduto <= 10)) {
			precoGramas = 35;
		}
		
		precoTotal = pesoGramas * precoGramas;
		System.out.println("o preço do produto é: " + precoTotal);
		
		
		switch (codePais) {
		
		case 1:
			imposto = 0;
			break;
		case 2:
			imposto = precoTotal * 15/100;
			break;
		case 3:
			imposto = precoTotal * 25/100;
			break;
		
		}
		
		System.out.println("O imposto é: " + imposto);
		
		precoFinal = precoTotal + imposto;
		System.out.println("O Valor do porduto final foi " + precoFinal);
		
	}
	
}