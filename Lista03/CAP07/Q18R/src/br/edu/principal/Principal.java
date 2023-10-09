package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vet[]= new int[18];
		int mat[][] = new int[3][6];
		int num=0;
		for(int i=0;i<18;i++) {
			int x = scanner.nextInt();
			vet[i]=x;
		}for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				mat[i][j] = vet[num];
				num++;
			}
		}for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
