package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor do comprimento em metros: ");
		double comm = scanner.nextDouble();
		System.out.println("Valor da lagura em metros: ");
		double larm = scanner.nextDouble();
		double area = comm*larm;
		System.out.println("O valor da área é "+area+" metros quadrados.");
		double pm2 = 18*area;
		System.out.println("O valor da potencia neessaria é de: "+pm2+"W");
		System.out.println("Para "+area+" metros quadrados.");
	}

}
