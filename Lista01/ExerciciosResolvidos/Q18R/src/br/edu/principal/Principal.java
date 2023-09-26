package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Peso do saco em quilos: ");
		double peso_saco = scanner.nextDouble();
		System.out.println("Racao gato 1 em gramas: ");
		double rg1 = scanner.nextDouble();
		System.out.println("Racao gato 2 em gramas: ");
		double rg2 = scanner.nextDouble();
		rg1 = rg1/1000;
		rg2 = rg2/1000;
		double tot = peso_saco - 5*(rg1+rg2);
		System.out.println("O total que sobrou apos 5 dias é: " + tot);
		
	}

}
