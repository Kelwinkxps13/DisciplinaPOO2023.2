package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);

	    int n1=0, n2=0, n3=0, n4=0, soma=0;
	    
	    System.out.println("Digite abaixo os 4 números");
	    System.out.print("numero 1: ");
	    n1 = numeros.nextInt();
	    System.out.print("numero 2: ");
	    n2 = numeros.nextInt();
	    System.out.print("numero 3: ");
	    n3 = numeros.nextInt();
	    System.out.print("numero 4: ");
	    n4 = numeros.nextInt();

	    soma = n1+n2+n3+n4;

	    System.out.println("A soma dos 4 números é: " + soma);

	}

}
