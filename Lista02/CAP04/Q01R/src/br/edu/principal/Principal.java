package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1=0,n2=0,n3=0;
		System.out.println("Digite a nota 1: ");
		n1 = scanner.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = scanner.nextDouble();
		System.out.println("Digite a nota 3: ");
		n3 = scanner.nextDouble();
		double media = (2*n1 + 3*n2 + 5*n3)/10;
		System.out.println("A media ponderada é de: "+media);
		if(media<=10 & media>=8) {
			System.out.println("Obteve conceito A");
		}
		else if(media<8 & media>=7) {
			System.out.println("Obteve conceito B");
		}
		else if(media<7 & media>=6) {
			System.out.println("Obteve conceito C");
		}
		else if(media<6 & media>=5) {
			System.out.println("Obteve conceito D");
		}
		else if(media<5 & media>=0) {
			System.out.println("Obteve conceito E");
		}

		
	}

}
