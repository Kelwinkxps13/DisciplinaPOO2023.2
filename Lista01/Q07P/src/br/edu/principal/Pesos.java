package br.edu.principal;

import java.util.Scanner;

public class Pesos {
	
	double peso;
	
	Scanner sc = new Scanner(System.in);
	
	public void setPeso() {
		
		System.out.print("Digite o peso da pessoa: ");
		this.peso = sc.nextDouble();
		
	}
	
	public double Engordar15() {
		return this.peso + this.peso * 15/100;
	}
	
	public double Emagrecer20() {
		return this.peso - this.peso * 20/100;
	}
	
}
