package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double sal=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário antigo do funcionário: ");
		sal = sc.nextDouble();
		sal += sal * 1/4;
		System.out.println("Novo salário do funcionário é: " + sal);
	}
}