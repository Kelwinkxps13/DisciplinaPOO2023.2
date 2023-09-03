package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		double nota1=0, nota2=0, nota3=0, peso1=0, peso2=0, peso3=0, media=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a nota 3: ");
		nota3 = sc.nextDouble();
		
		System.out.print("Digite o peso 1: ");
		peso1 = sc.nextDouble();
		System.out.print("Digite o peso 2: ");
		peso2 = sc.nextDouble();
		System.out.print("Digite o peso 3: ");
		peso3 = sc.nextDouble();
		
		media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(nota1+nota2+nota3);
		
		System.out.println(media);

	}
}