package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double saldo, credito;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do seu saldo médio no último ano: ");
		saldo = sc.nextDouble();
		
		if (saldo > 400) {
			credito = saldo * 30 / 100;
		}
		else if (saldo > 300) {
			credito = saldo * 25 / 100;
		}
		else if (saldo > 200) {
			credito = saldo * 20 / 100;
		}
		else {
			credito = saldo * 10 / 100;
		}
		
		System.out.println("O valor do seu saldo médio no último ano foi: " + saldo);
		System.out.println("O valor do seu crédito especial é: " + credito);

	}

}