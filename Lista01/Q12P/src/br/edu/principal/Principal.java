package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do salário mínimo: ");
		double salmin = scanner.nextDouble();
		System.out.println("Digite o valor do salário do funcionário: ");
		double salfun = scanner.nextDouble();
		double qtdsalmin = salfun/salmin;
		System.out.println("A quantidade de salarios mínimos que o funcionario recebe é: ");
		System.out.println(qtdsalmin);
		

	}

}
