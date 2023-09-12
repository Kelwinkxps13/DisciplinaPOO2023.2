package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o num1: ");
		double num1 = scanner.nextDouble();
		System.out.print("Digite o num2: ");
		double num2 = scanner.nextDouble();
		if (num1>num2) {
			System.out.println("O número "+num1+" é maior");
		}
		else if (num1<num2) {
			System.out.println("O número "+num2+" é maior");
		}
		else {
			System.out.println("Os números são iguais.");
		}

	}

}
