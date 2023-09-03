package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor salario minimo: ");
		double sal = scanner.nextDouble();
		System.out.println("qtd de quilowatts: ");
		double qtdkw = scanner.nextDouble();
		double vlrkw = sal/5;
		double vlrreais = vlrkw*qtdkw;
		double desc = vlrreais*15/100;
		double vlrdesc = vlrreais - desc;
		System.out.println("Valor de quilowatts: " + vlrkw);
		System.out.println("Valor pago por essa residenia: " + vlrreais);
		System.out.println("Valor pago com desc de 15 porcento: " + vlrdesc);
		

	}

}
