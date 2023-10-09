package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		AreaLosango Al = new AreaLosango();
		
		Al.setDiagonalMaior();
		Al.setDiagonalMenor();
		
		System.out.println("A área do losango é: " + Al.getAreaLosango());
		
	}
}