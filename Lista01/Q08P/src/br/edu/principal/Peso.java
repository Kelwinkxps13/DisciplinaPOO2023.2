package br.edu.principal;

import java.util.Scanner;

public class Peso {

	double pesoKg, pesoG;
	
	Scanner sc = new Scanner(System.in);
	
	public void setPeso() {
		
		System.out.print("Digite o peso de uma pessoa em Kg: ");
		pesoKg = sc.nextDouble();
		setPesoG();
		
	}
	
	public void setPesoG() {
		
		pesoG = this.pesoKg * 1000;
		
	}
	
}