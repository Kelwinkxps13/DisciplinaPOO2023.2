package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hora;
		int h, m;
		
		System.out.print("Digite a hora no formato (HH,MM): ");
		hora = sc.nextDouble();
		
		h = (int) hora;
		m = (int) Math.round((hora - h)*100);

		System.out.println("A hora apenas em minutos é: " + (h*60+m));
	}
}