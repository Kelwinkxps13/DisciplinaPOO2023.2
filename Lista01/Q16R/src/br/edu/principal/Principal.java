package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Horas trabalhadas: ");
		double horas_t = scanner.nextDouble();
		System.out.print("Valor do salario min: ");
		double vlr_sal_min = scanner.nextDouble();
		double vlr_hora_t = vlr_sal_min/2;
		double vlr_sal_bru = vlr_sal_min*horas_t;
		double imp = vlr_sal_bru*3/100;
		double vlr_sal_liq = vlr_sal_bru - imp;
		System.out.println("O valor do salário líquido é: " + vlr_sal_liq);
		
		

	}

}
