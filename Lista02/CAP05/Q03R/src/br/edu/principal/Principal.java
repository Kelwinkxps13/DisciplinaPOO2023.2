package br.edu.principal;


import java.util.Scanner;

public class Principal {
    
	public static void main(String[] args) {
    
		long n, num, i, j, fat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para n: ");
        n = scanner.nextLong();

        for (i = 1; i <= n; i++) {
            System.out.print("Digite um número: ");
            num = scanner.nextLong();

            fat = 1;
            for (j = 1; j <= num; j++) {
                fat *= j;
            }

            System.out.println("O fatorial de " + num + " é: " + fat);
           
        }
    }
}