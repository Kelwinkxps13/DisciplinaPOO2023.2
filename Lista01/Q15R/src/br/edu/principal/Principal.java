package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precoFab, percentLucro, percentImposto, valorLucro, valorImposto;
		
		System.out.print("Digite o preço do fabrcante: ");
		precoFab = sc.nextDouble();
		
		System.out.print("Digite o percentual de lucro: ");
		percentLucro = sc.nextDouble();
		
		System.out.print("Digite o percentual de imposto: ");
		percentImposto = sc.nextDouble();
		
		valorLucro = precoFab*percentLucro/100;
		
		valorImposto = precoFab*percentImposto/100;
		
		System.out.println("O lucro do distribuidor foi de " + valorLucro + " R$");
		
		System.out.println("O imposto foi de " + valorImposto + " R$");
		
		System.out.println("O valor final do produto foi de " + (precoFab+valorLucro+valorImposto) + " R$");

	}

}
