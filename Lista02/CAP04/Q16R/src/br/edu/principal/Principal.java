package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double preco, venda, novoPreco=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço atual do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Digite a média de vendas mensais: ");
		venda = sc.nextDouble();
		
		if ((venda < 500) | (preco < 30)) {
			novoPreco = preco + preco * 10/100;
		}
		else if (((venda >= 500) & (venda < 1200)) | ((preco >= 30) & (preco < 80))) {
			novoPreco = preco + preco * 15/100;
		}
		else if ((venda >= 1200) | (preco >= 80)) {
			novoPreco = preco - preco * 20/100;
		}

		System.out.println("O novo preço do produto é: " + novoPreco);
		
	}
}