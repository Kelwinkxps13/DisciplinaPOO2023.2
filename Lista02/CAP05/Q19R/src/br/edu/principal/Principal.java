package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		long m, n, soma, i;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para m: ");
		m = sc.nextLong();

		System.out.print("Digite um nnúmero para n: ");
		n = sc.nextLong();

		while (m < n) {
			soma = 0;
			for (i = m; i <= n; i++) {
				soma += i;
			}
			System.out.println("O valor da soma é: " + soma);

			System.out.print("Digite um número para m: ");
			m = sc.nextLong();

			System.out.print("Digite um número para n: ");
			n = sc.nextLong();
		}
	}
}