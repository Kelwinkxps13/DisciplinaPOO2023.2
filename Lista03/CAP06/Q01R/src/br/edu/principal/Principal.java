package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x[]= new int[9];
		
		for(int i=0;i<9;i++) {
			int y = scanner.nextInt();
			x[i]=y;	
		}for(int i=0; i<9;i++) {
			int prim =0;
			for(int j=1; j<=x[i]; j++) {
				if(x[i]%j==0) {
					prim+=1;
				}
			}
			if(prim==2) {
				System.out.println(x[i]+" é primo e está na posição "+i);
			}
		}
		

	}

}
