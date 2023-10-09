package br.edu.principal;

import java.util.Scanner;

public class Produto {

	double preco;
	
	Scanner sc = new Scanner(System.in);
	
	public void setPreco() {
		
		System.out.print("Digite o preço do produto: ");
		this.preco = sc.nextDouble();
		
	}
	
	public double desconto10() {
		return preco - preco * 10/100;
	}
	
}