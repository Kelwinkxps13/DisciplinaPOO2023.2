package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner medial = new Scanner(System.in);

	    System.out.print("Digite a primeira nota: ");
	    double nota1 = medial.nextDouble();
	    System.out.print("Digite a segunda nota: ");
	    double nota2 = medial.nextDouble();
	    System.out.print("Digite a terceira nota: ");
	    double nota3 = medial.nextDouble();
	    double media = (nota1+nota2+nota3)/3;

	    System.out.println("A média das notas é: " + media);

	}

}
