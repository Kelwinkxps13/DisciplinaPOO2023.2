package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = "";
		double precos = 0;
		double transportes = 0;
		double finals = 0;
		
		String nomes[] = new String[5];
		double preco[][] = new double[5][4];
		double imp[][] = new double[5][4];
		double transporte[] = new double[5];
		
		// nomes
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite o nume do produto "+(i)+":");
			nome = scanner.nextLine();
			nomes[i] = nome;
		}
		
		//precos
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("Digite o preco do produto "+nomes[i]+" na loja "+(j)+":");
				precos = scanner.nextDouble();
				preco[i][j] = precos;
			}
		}
		
		// preco transporte
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite o preco de transporte do produto "+nomes[i]+":");
			transportes = scanner.nextDouble();
			transporte[i] = transportes;
		}
		
		// segunda matriz
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(preco[i][j]<50) {
					imp[i][j] = preco[i][j]*5/100;
				}else if(preco[i][j]>=50 && preco[i][j]<=100) {
					imp[i][j] = preco[i][j]*10/100;
				}else if(preco[i][j]>100) {
					imp[i][j] = preco[i][j]*20/100;
			}	}
		}
		
		//final
		
		for(int i=0; i<5; i++) {
			System.out.println("nume do produto: "+nomes[i]);
			System.out.println("Custo: "+transporte[i]);
			for(int j=0; j<4; j++) {
				finals = preco[i][j]+imp[i][j]+transporte[i];
				System.out.println("Imposto na loja "+j+" = "+imp[i][j]);
				System.out.println("Preço na loja "+j+" = "+preco[i][j]);
				System.out.println("Preço final na loja "+j+" = "+finals);
				
			}
			System.out.println();
		}
		
	}
}
