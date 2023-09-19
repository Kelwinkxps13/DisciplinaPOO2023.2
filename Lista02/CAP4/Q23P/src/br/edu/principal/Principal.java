package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codprod=0, qtdprod=0;
		do {
			System.out.println("Digite o codigo do produto comprado (entre 1 e 40): ");
			codprod = scanner.nextInt();
			if (codprod<1 | codprod>40) {
				System.out.println("numero invalido");
			}
		}while(codprod<1 | codprod>40);
		System.out.println("Digite a quantidade comprada do produto: ");
		qtdprod = scanner.nextInt();
		double precounid=0;
		if (codprod>=1 & codprod<=10) {
			precounid = 10;
		}
		else if (codprod>=11 & codprod<=20) {
			precounid = 15;
		}
		else if (codprod>=21 & codprod<=30) {
			precounid = 20;
		}
		else if (codprod>=31 & codprod<=40) {
			precounid = 30;
		}
		System.out.println("O preço da unidade é R$"+precounid);
		double precotot = precounid*qtdprod;
		System.out.println("O valor total é R$"+precotot);
		double desconto = 0;
		if (precotot<=250) {
			desconto = precotot*5/100;
		}
		else if (precotot>250 & precotot<=500) {
			desconto = precotot*10/100;
		}
		else if (precotot>500) {
			desconto = precotot*15/100;
		}
		System.out.println("Será aplicado o desconto de R$"+desconto);
		double precofinal = precotot - desconto;
		System.out.println("O valor a ser pago é R$"+precofinal);
	}

}
