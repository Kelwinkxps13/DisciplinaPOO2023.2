package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		double salario, novoSalario, bonificacao, auxilio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o sal�rio inicial do funcion�rio: ");
		salario = sc.nextDouble();
		
		bonificacao = (salario<=500) ? salario*5/100 : ((salario<=1200) ? salario*12/100 : 0);
		auxilio = (salario<=600) ? 150 : 100;
		
		novoSalario = salario + bonificacao + auxilio;
		
		System.out.println("O novo sal�rio �: " + novoSalario);
	}
	
}