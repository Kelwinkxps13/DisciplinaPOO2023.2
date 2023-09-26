package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o salario do funcionario: ");
		double sal = scanner.nextDouble();
		System.out.println("Digite o valor das vendas: ");
		double ven = scanner.nextDouble();
		double comissao = ven*4/100;
		double newsal = sal+comissao;
		System.out.println("O valor da comissao é: "+comissao);
		System.out.println("O valor do novo salario é: "+newsal);

	}

}
