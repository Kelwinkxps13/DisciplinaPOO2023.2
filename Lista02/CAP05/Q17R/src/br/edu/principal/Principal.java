package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        
	        double salCarlos, salJoao;
	        int meses = 0;

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite o salário de Carlos: ");
	        salCarlos = sc.nextDouble();

	        salJoao = salCarlos / 3;

	        while (salJoao < salCarlos) {
	            salCarlos += (salCarlos * 2 / 100);
	            salJoao += (salJoao * 5 / 100);
	            meses++;
	        }

	        System.out.println("A quantidade de meses necessários é: " + meses);
	    }
}