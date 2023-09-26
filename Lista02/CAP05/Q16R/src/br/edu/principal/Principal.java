package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double base, altura, area;

		do {
            System.out.print("Digite a base: ");
            base = scanner.nextDouble();
            if (base<=0) {
            	System.out.println("Numero invalido");
            }
        } while (base <= 0);
        
        do {
            System.out.print("Digite a altura: ");
            altura = scanner.nextDouble();
            if (altura<=0) {
            	System.out.println("Numero invalido");
            }
        } while (altura <= 0);
        
        area = base * altura / 2;
        
        System.out.println("A área é: " + area);
    }
		
}