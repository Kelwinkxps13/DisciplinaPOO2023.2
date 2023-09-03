package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double salBase=0, sal=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Salário base: ");
		salBase = sc.nextDouble();
		
		sal = (salBase + salBase*5/100 - salBase*7/100);
		
		System.out.println("O salário desse funcionário é: " + sal);
	}
}