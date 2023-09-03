package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva um numero real: ");
		double real = scanner.nextDouble();
		double inteiro = (int)real;
		double fracionario = real - inteiro;
		double arredondamento = Math.round(real);
		System.out.println("parte inteira: " + inteiro);
		System.out.println("Parte fracionaria: " + fracionario);
		System.out.println("Parte arredondada: " + arredondamento);

	}

}
