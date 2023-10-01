package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m[][] = new int[2][2];
		int r[][] = new int[2][2];
		int x;
		for(int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print("Digite o numero da posicao linha "+i+" coluna "+j+":");
				x = scanner.nextInt();
				m[i][j] = x;
				
			}
		}
		
		for(int i = 0;i<2;i++) {
			for(int j=0; j<2; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
		int maior = Integer.MIN_VALUE;
		for(int i=0; i<2; i++) {
			
			for (int j=0; j<2; j++) {
				if(m[i][j]>=maior) {
					maior = m[i][j];
				}
			}
		}
		System.out.println("");
		for(int i=0; i<2; i++) {

			for (int j=0; j<2; j++) {
				r[i][j] = m[i][j]*maior;
				System.out.print(r[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
