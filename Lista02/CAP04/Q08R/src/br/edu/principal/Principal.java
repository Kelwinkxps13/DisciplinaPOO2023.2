package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		int op;
		
		System.out.println("============ MENU ============\n1 - Somar dois números\n2 - Raiz quadrada de um número\n==============================");
		
		System.out.print("Digite sua opção: ");
		op = sc.nextInt();
		
		if (op == 1) {
			
			System.out.print("Digite o primeiro número da soma: ");
			num1 = sc.nextDouble();
			
			System.out.print("Digite o segundo número da soma: ");
			num2 = sc.nextDouble();
			
			System.out.println("A soma " + num1 + " + " + num2 + " é igual: " + (num1 + num2));
			
		}
		
		else if (op == 2) {
			
			System.out.print("Digite um valor para ser calculada a raiz quadrada: ");
			num1 = sc.nextDouble();
			
			System.out.println("A raiz quadrada de " + num1 + " é: " + Math.sqrt(num1));
			
		}
		
		else {
			
			System.out.println("Opção inválida");
			
		}
		
	}
	
}