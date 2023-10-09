package br.edu.principal;

import java.util.Scanner;

public class AreaTrapezio {

	double baseMaior, baseMenor, altura;
	
	Scanner sc = new Scanner(System.in);
	
	public void setBaseMaior() {
		
		System.out.print("Digite o valor da base maior: ");
		this.baseMaior = sc.nextDouble();
		
	}
	
	public void setBaseMenor() {
		
		System.out.print("Digite o valor da base menor: ");
		this.baseMenor = sc.nextDouble();
		
	}
	
	public void setAltura() {
		
		System.out.print("Digite o valor da altura: ");
		this.altura = sc.nextDouble();
		
	}
	
	public double getAreaTrapezio() {
		return (this.baseMaior + this.baseMenor) * this.altura / 2.0;
	}
	
}