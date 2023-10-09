package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int dia1, mes1, ano1, dia2, mes2, ano2;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira data\ndia (dd): ");
		dia1 = sc.nextInt();
		System.out.print("mês (mm): ");
		mes1 = sc.nextInt();
		System.out.print("ano (aaaa): ");
		ano1 = sc.nextInt();
		
		System.out.print("Digite a segunda data\ndia (dd): ");
		dia2 = sc.nextInt();
		System.out.print("mês (mm): ");
		mes2 = sc.nextInt();
		System.out.print("ano (aaaa): ");
		ano2 = sc.nextInt();
		
		if (ano1 > ano2) {
			System.out.println("A maior data é: " + dia1 + "/" + mes1 + "/" + ano1);
		}
		
		else if (ano2 > ano1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		}
		
		else if (mes1 > mes2) {
			System.out.println("A maior data é: " + dia1 + "/" + mes1 + "/" + ano1);
		}
		
		else if (mes2 > mes1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		}
		
		else if (dia1 > dia2) {
			System.out.println("A maior data é: " + dia1 + "/" + mes1 + "/" + ano1);
		}
		
		else if (dia2 > dia1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		}
		
		else {
			System.out.println("As dastas são iguais.");
		}
		
	}

}
