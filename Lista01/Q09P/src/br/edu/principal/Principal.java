package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		AreaTrapezio At = new AreaTrapezio();
		
		At.setBaseMaior();
		At.setBaseMenor();
		At.setAltura();
		
		System.out.println("A área do trapézio é: " + At.getAreaTrapezio());
		
	}
}