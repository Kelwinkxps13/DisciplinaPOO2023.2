package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double angulo, radiano, altura;
		
		System.out.print("Digite o valor do angulo em graus: ");
		angulo = sc.nextDouble();
		
		radiano = angulo*Math.PI/180;
		
		System.out.print("Digite a altura da escada: ");
		altura = sc.nextDouble();
		
		System.out.println("A escada mede " + altura/Math.sin(radiano));
		
	}
}