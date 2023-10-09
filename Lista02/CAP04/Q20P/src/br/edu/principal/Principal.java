package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		idade = sc.nextInt();
		
		if (idade > 30) {
			System.out.println("O nadador é do nível Sênior");
		}
		else if (idade >= 16) {
			System.out.println("O nadador é do nível Adulto");
		}
		else if (idade >= 11) {
			System.out.println("O nadador é do nível Adolescente");
		}
		else if (idade >= 8) {
			System.out.println("O nadador é do nível Juvenil");
		}
		else if (idade >= 5) {
			System.out.println("O nadador é do nível Infantil");
		}
		else {
			System.out.println("O nadador não pertence a nenhuma categoria");
		}
		
	}

}