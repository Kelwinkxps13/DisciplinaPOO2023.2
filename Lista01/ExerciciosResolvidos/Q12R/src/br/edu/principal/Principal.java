package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		double n1 = Math.pow(num1, num2);
		double n2 = Math.pow(num2, num1);
		System.out.println("num1^num2 = " + n1);
		System.out.println("num2^num1 = " + n2);
		

	}

}
