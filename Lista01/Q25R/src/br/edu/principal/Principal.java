package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Custo do espetáculo: ");
		double custo = scanner.nextDouble();
		System.out.println("Preço do convite: ");
		double convite = scanner.nextDouble();
		double qtd = custo/convite;
		System.out.println(qtd);

	}

}
