package br.edu.principal;

public class Principal {
	
	public static void main(String[] args) {
	
		Produto p = new Produto();
		
		p.setPreco();
		System.out.println("O novo preço do produto com desconto é: " + p.desconto10());
		
	}
	
}