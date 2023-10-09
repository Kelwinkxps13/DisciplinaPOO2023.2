package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		long num, maiorNum, menorNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número positivo qualquer para o conjunto, digite \"0\" (sem aspas) para terminar o conjunto:");
		
		num = sc.nextLong();
		
		maiorNum = num;
		menorNum = num;
		
		while (num != 0) {
			
			num = sc.nextLong();
			
			
			if (num < 0) {
				System.out.println("Números negativos não são válidos!");
			}
			else if ((num > maiorNum) & (num!=0)) {
				maiorNum = num;
			}
			else if ((num < menorNum) & (num!=0)) {
				menorNum = num;
			}
			
		}
		
		if (maiorNum == 0) {
			System.out.println("Não existe nenhum número no conjunto");
		}
		else {
			System.out.println("O maior número do conjunto é: " + maiorNum);
			System.out.println("O menor número do conjunto é: " + menorNum);
		}
	}
	
}