package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		Pesos p = new Pesos();
		
		p.setPeso();
		
		System.out.println("Se a pessoa engordar 15% ela pesará: " + p.Engordar15());
		System.out.println("Se a pessoa emagrecer 20% ela pesará: " + p.Emagrecer20());

	}

}