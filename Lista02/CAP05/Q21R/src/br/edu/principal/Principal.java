package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		long num, qtd = 0, maior = 0, menor = 0, qtdPar = 0;
		double soma = 0, mediaPar = 0, somaPar = 0, media = 0, qtdImpar = 0, porcentoImpar = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite números (digite 30000 para encerrar):");
		num = sc.nextLong();

		while (num != 30000) {
			if (qtd == 0) {
				maior = num;
				menor = num;
			} else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}

			soma += num;
			qtd++;

			if (num % 2 == 0) {
				somaPar += num;
				qtdPar++;
			} else {
				qtdImpar++;
			}

			num = sc.nextLong();
		}

		if (qtd == 0) {
			System.out.println("Nenhum número digitado");
		} else {
			
			media = soma / qtd;
			
			System.out.println("A soma é: " + soma);
			System.out.println("A quantidade é: " + qtd);
			System.out.println("A média é: " + media);
			System.out.println("O maior número é: " + maior);
			System.out.println("O menor número é: " + menor);

			if (qtdPar == 0) {
				System.out.println("Nenhum número par");
			} else {
				mediaPar = somaPar / qtdPar;
				System.out.println("A média dos números pares é: " + mediaPar);
			}

			porcentoImpar = (qtdImpar / qtd) * 100;
			System.out.println("A porcentagem de números ímpares é: " + porcentoImpar + "%");
		}

	}	

}