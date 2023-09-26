package br.edu.principal;


import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a=0, b=0, c=0, delta=0, x1=0, x2=0;
		
		do {
			System.out.println("Digite o valor de a: ");
			a = scanner.nextDouble();
			if (a==0) {
				System.out.println("O valor de 'a' deve ser diferente de zero");
			}
		}while(a==0);
		
		System.out.println("Digite o valor de b: ");
		b = scanner.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = scanner.nextDouble();
		delta = (b*b)-(4*a*c);
		if(delta<0) {
			System.out.println("Nâo existm raizes reais");
		}
		else if (delta==0) {
			x1 = (-b)/(2*a);
			System.out.println("A raíz é: "+x1);
		}
		else if(delta>0) {
			x1 = (-b - Math.sqrt(delta))/(2*a);
			x2 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println("As raízes são: x1 = "+x1+" e x2 = "+x2);
		}
		
	}
}
