package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor em pés: ");
		double pes = scanner.nextDouble();
		double polegadas = pes*12;
		double jardas = pes/3;
		double milhas = jardas/1760;
		System.out.println("Polegadas: " + polegadas);
		System.out.println("Jardas: " + jardas);
		System.out.println("Milhas: " + milhas);
	}

}
