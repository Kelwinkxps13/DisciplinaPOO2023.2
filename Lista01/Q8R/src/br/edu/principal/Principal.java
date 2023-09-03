package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner depositol = new Scanner(System.in);

	    double deposito=0, taxa=0, rendimento=0, total=0;

	    System.out.print("Digite o deposito: R$");
	    deposito = depositol.nextDouble();
	    System.out.print("Digite a taxa de aumento: ");
	    taxa = depositol.nextDouble();
	    rendimento = deposito*taxa/100;
	    total = deposito + rendimento;
	    System.out.println("Seu rendimento: R$" + rendimento);
	    System.out.println("Seu valor total após o rendimento é R$" + total);

	}

}
