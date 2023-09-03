package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a=0,b=0;
		System.out.println("digite o valor do primeiro numero: ");
		a = scanner.nextDouble();
		do {
			System.out.println("Digite o valor do segundo:");
			b = scanner.nextDouble();
			if (b==0) {
				System.out.println("Não entre com valor zero.");
			}
		}while(b==0);
		double c = a/b;
		System.out.println("O valor de a por b é:");
		System.out.println(c);

	}

}
