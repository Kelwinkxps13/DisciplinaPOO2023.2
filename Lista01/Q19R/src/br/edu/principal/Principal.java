package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double alturaDegrau, alturaAlcancar;
		
		System.out.print("Digite a altura do degrau: ");
		alturaDegrau = sc.nextDouble();
		
		System.out.print("Digite a altura que o usuario deseja alcançar: ");
		alturaAlcancar = sc.nextDouble();
		
		System.out.println("Ele deverá subir " + (alturaAlcancar/alturaDegrau) + " degraus");
	}
}