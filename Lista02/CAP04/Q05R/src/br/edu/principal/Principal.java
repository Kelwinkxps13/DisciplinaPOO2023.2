package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1=0, num2=0, num3=0, num4=0;
		System.out.println("Digite um numero 1: ");
		num1 = scanner.nextDouble();
		do {
			System.out.println("Digite um número 2: ");
			num2 = scanner.nextDouble();
			
			if (num2<=num1) {
				System.out.println("Número inválido.");
				System.out.println("Digite um numero 2 onde ele é maior que num1.");
			}
		}while(num2<=num1);
		do {
			System.out.println("Digite um número 3: ");
			num3 = scanner.nextDouble();
			
			if (num3<=num1) {
				System.out.println("Número inválido.");
				System.out.println("Digite um numero 3 onde ele é maior que num2.");
			}
		}while(num3<=num2);
		System.out.println("Digite um número 4: ");
		num4 = scanner.nextDouble();
		if (num4>num3) {
			System.out.println("A ordem decrescente dos números é: ");
			System.out.println(num4+", "+num3+", "+num2+", "+num1+".");
		}
		else if(num4<num3 & num4>num2) {
			System.out.println("A ordem decrescente dos números é: ");
			System.out.println(num3+", "+num4+", "+num2+", "+num1+".");
		}
		else if(num4<num2 & num4>num1) {
			System.out.println("A ordem decrescente dos números é: ");
			System.out.println(num3+", "+num2+", "+num4+", "+num1+".");
		}
		else if (num4<num1){
			System.out.println("A ordem decrescente dos números é: ");
			System.out.println(num3+", "+num2+", "+num1+", "+num4+".");
		}

	}

}
