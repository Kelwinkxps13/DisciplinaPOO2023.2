package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		
		if ((num1 <= num2) & (num1 <= num3)) {
			System.out.println("A ordem crescente é: " + num1 + " - " + ((num2 <= num3) ? (num2 + " - " + num3) : (num3 + " - " + num2)));
		}
		
		else if ((num2 <= num1) & (num2 <= num3)) {
			System.out.println("A ordem crescente é: " + num2 + " - " + ((num1 <= num3) ? (num1 + " - " + num3) : (num3 + " - " + num1)));
		}
		
		else if ((num3 <= num1) & (num3 <= num2)) {
			System.out.println("A ordem crescente é: " + num3 + " - " + ((num1 <= num2) ? (num1 + " - " + num2) : (num2 + " - " + num1)));
		}
		
	}
	
}