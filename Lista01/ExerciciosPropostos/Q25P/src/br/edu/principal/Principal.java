package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor da hora: ");
		long hora = scanner.nextLong();
		System.out.println("Digite o valor dos minutos: ");
		long min = scanner.nextLong();
		long hemm = hora*60;
		long totmin = hemm+min;
		long totseg = totmin*60;
		System.out.println("O valor da hora digitada convertida em minutos é: "+hemm);
		System.out.println("Total de minutos: "+totmin);
		System.out.println("Total de segundos: "+totseg);
		

	}

}
