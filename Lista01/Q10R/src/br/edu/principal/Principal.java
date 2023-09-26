package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner raiol = new Scanner(System.in);
		
  		double raio=0, area=0;
  		
  		System.out.print("Digite o valor do raio: ");
  		raio = raiol.nextDouble();
  		area = 3.1415*raio*raio;
  		System.out.println("A área do círculo é: " + area);

	}

}
