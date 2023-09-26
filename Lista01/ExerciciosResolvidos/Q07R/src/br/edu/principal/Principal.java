package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salBase=0, salFinal=0;
		
		System.out.print("Digite o salário base do funcionário: ");
		salBase = sc.nextDouble();
		
		salFinal = salBase + 50 - salBase * 10/100; //salBase + 50 - imposto
		
		System.out.println("O salário a receber é: " + salFinal);
	}
}