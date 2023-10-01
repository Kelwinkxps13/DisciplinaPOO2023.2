package br.edu.principal;

import java.util.Scanner;

import br.edu.util.Rotina;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valor_antigo = scanner.nextDouble();
		double valor_novo = scanner.nextDouble();
		double acrescimo = Rotina.acrescimo(valor_antigo, valor_novo);
		System.out.println(acrescimo);

	}

}
