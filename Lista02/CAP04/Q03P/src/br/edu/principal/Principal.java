package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		
		if (num1 == num2) {
			System.out.println("Ambos os números são iguais");
		}
		else {
			System.out.println("O menor número é: " + ((num1<num2) ? num1 : num2));
		}
		
	}
	
}