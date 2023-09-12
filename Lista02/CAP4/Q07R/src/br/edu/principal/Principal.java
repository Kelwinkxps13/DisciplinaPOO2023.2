package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0;
		double a=0, b=0, c=0;
		do {
			System.out.println("Digite um valor inteiro entre o intervalo 0 e 3: ");
			i = scanner.nextInt();
			if (i<=0 | i>3) {
				System.out.println("Número inválido, tente novamente.");
			}
		}while(i<=0 | i>3);
		System.out.println("DIgite um número a real: ");
		a = scanner.nextDouble();
		do {
			System.out.println("DIgite um número a real: ");
			b = scanner.nextDouble();
			if (b==a) {
				System.out.println("Digite um número diferente do já escolhido.");
			}
		}while(b==a);
		do {
			System.out.println("DIgite um número a real: ");
			c = scanner.nextDouble();
			if(c==b | c==a) {
				System.out.println("Digite um número diferente dos já escolhidos.");
			}
		}while(c==b | c==a);
		if (i==1) {
			if (a<b & a<c & b<c) {
				System.out.println("a ordem crescente dos números é: "+a+", "+b+", "+c);
			}
			else if (a<b & a<c & c<b) {
				System.out.println("a ordem crescente dos números é: "+a+", "+c+", "+b);
			}
			if (b<a & b<c & a<c) {
				System.out.println("a ordem crescente dos números é: "+b+", "+a+", "+c);
			}
			else if (b<a & b<c & c<a) {
				System.out.println("a ordem crescente dos números é: "+b+", "+c+", "+a);
			}
			if (c<a & c<b & a<b) {
				System.out.println("a ordem crescente dos números é: "+c+", "+a+", "+b);
			}
			else if (c<b & c<b & b<a) {
				System.out.println("a ordem crescente dos números é: "+c+", "+b+", "+a);
			}
		}
		if (i==2) {
			if (a>b & a>c & b>c) {
				System.out.println("a ordem decrescente dos números é: "+a+", "+b+", "+c);
			}
			else if (a>b & a>c & c>b) {
				System.out.println("a ordem decrescente dos números é: "+a+", "+c+", "+b);
			}
			if (b>a & b>c & a>c) {
				System.out.println("a ordem decrescente dos números é: "+b+", "+a+", "+c);
			}
			else if (b>a & b>c & c>a) {
				System.out.println("a ordem decrescente dos números é: "+b+", "+c+", "+a);
			}
			if (c>a & c>b & a>b) {
				System.out.println("a ordem decrescente dos números é: "+c+", "+a+", "+b);
			}
			else if (c>b & c>b & b>a) {
				System.out.println("a ordem decrescente dos números é: "+c+", "+b+", "+a);
			}
		}
		if (i==3) {
			if (a>b & a>c) {
				System.out.println("a ordem desejada dos números é: "+b+", "+a+", "+c);
			}
			if (b>a & b>c) {
				System.out.println("a ordem desejada dos números é: "+a+", "+b+", "+c);
			}
			if (c>a & c>b) {
				System.out.println("a ordem desejada dos números é: "+a+", "+c+", "+b);
			}
			
		}
		
	}

}
