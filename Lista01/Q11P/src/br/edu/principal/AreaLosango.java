package br.edu.principal;

import java.util.Scanner;

public class AreaLosango {

	double diagonalMaior, diagonalMenor;
	
	Scanner sc = new Scanner(System.in);
	
	public void setDiagonalMaior() {
		
		System.out.print("Digite o valor da diagonal maior: ");
		this.diagonalMaior = sc.nextDouble();
		
	}
	
	public void setDiagonalMenor() {
		
		System.out.print("Digite o valor da diagonal menor: ");
		this.diagonalMenor = sc.nextDouble();
		
	}
		
	public double getAreaLosango() {
		return this.diagonalMaior * this.diagonalMenor / 2.0;
	}

}