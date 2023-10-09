package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int cont, num1, num2, result;
		
		num1 = 0;
		num2 = 1;
		System.out.println("O 1° número é: " + num1);
		System.out.println("O 2° número é: " + num2);
		
		for (cont = 3; cont <=8; cont++) {
			
			result = num1 + num2;
			System.out.println("O " + cont + "° número é: " + result);
			
			num1 = num2;
			num2 = result;
		}
		
	}
}