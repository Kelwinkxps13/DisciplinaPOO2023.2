package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base=0, altura=0;
		
		System.out.print("Digite o valor da base do triangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Digite o valor da altura do triangulo: ");
		altura = sc.nextDouble();
		
		System.out.println("A area do triangulo é: " + base*altura /2);
	}
}