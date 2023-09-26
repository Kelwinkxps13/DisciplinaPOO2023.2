package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num, quad, cubo, raiz;

    System.out.print("Digite um número: ");
    num = scanner.nextDouble();

    while (num > 0) {
        quad = num * num;
        cubo = num * num * num;
        raiz = Math.sqrt(num);

        System.out.println("Quadrado: " + quad);
        System.out.println("Cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raiz);

        System.out.print("Digite outro número (ou 0 para sair): ");
        num = scanner.nextDouble();
    	}

	}
}