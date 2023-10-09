package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double cpmf = 0.38/100.0;
		double salario, cheque1, cheque2, cpmf1, cpmf2;
		
		System.out.print("Digite o valor do salario: ");
		salario = sc.nextDouble();
		
		System.out.print("Digite o valor do primeiro cheque: ");
		cheque1 = sc.nextDouble();
		
		System.out.print("Digite o valor do segundo cheque: ");
		cheque2 = sc.nextDouble();
		
		cpmf1 = cheque1*cpmf;
		
		cpmf2 = cheque2*cpmf;
		
		System.out.println("O saldo da conta é de " + (salario-cheque1-cpmf1-cheque2-cpmf2) + " R$");
	}
}