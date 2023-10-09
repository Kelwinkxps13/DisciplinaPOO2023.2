package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double tamanhoEscada, alturaQuadro;
		
		System.out.print("Digite o tamanho da escada: ");
		tamanhoEscada = sc.nextDouble();
		
		System.out.print("Digite a altura que deseja colocar o quadro: ");
		alturaQuadro = sc.nextDouble();
		
		System.out.println("A escada deve estar da parede " + Math.sqrt(Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2)));
	}
}