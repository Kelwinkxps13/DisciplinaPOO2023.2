package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade=0;
		double peso=0;
		System.out.println("Sua idade");
		idade = scanner.nextInt();
		System.out.println("seu peso");
		peso = scanner.nextDouble();
		if(idade<20) {
			if(peso<=60) {
				System.out.println("Grupo de risco 9");
			}
			if(peso>60 & peso<=90) {
				System.out.println("Grupo de risco 8");
			}
			if (peso>90) {
				System.out.println("Grupo de risco 7");
			}
		}
		if(idade>=20 & idade<=50) {
			if(peso<=60) {
				System.out.println("Grupo de risco 6");
			}
			if(peso>60 & peso<=90) {
				System.out.println("Grupo de risco 5");
			}
			if (peso>90) {
				System.out.println("Grupo de risco 4");
			}
		}
		if(idade>50) {
			if(peso<=60) {
				System.out.println("Grupo de risco 3");
			}
			if(peso>60 & peso<=90) {
				System.out.println("Grupo de risco 2");
			}
			if (peso>90) {
				System.out.println("Grupo de risco 1");
			}
		}

	}

}
