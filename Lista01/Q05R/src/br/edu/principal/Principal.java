package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);

	    double sal=0, perc=0, aumento=0, novosal=0;

	    System.out.print("Digite o salario: R$");
	    sal = salario.nextDouble();
	    System.out.print("Digite o percentual de aumento: ");
	    perc = salario.nextDouble();
	    aumento = sal*perc/100;
	    novosal = sal + aumento;
	    System.out.println("Seu novo salário é R$" + novosal);

	}

}
