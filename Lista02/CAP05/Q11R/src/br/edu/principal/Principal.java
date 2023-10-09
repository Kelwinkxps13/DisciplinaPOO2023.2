package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);
        long i, num, qtd;
        
        qtd = 0;

        System.out.print("Digite um número: ");
        num = sc.nextLong();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                qtd++;
            }
        }

        if (qtd > 2) {
            System.out.println("Número não primo");
        } else {
            System.out.println("Número primo");
        }
	}
}