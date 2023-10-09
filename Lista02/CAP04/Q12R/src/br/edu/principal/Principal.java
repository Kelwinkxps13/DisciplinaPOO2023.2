package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		int cargo;
		double salario, aumento, novoSalario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
		cargo = sc.nextInt();
		
		System.out.print("Digite o vlaor do salário: ");
		salario = sc.nextDouble();

		switch (cargo) {
			
			case 1:
				
				System.out.println("O cargo é Escriturário");
				
				aumento = salario * 50/100;
				System.out.println("O valor do aumento é: " + aumento);
				
				novoSalario = salario + aumento;
				System.out.println("O valor do novo salário é: " + novoSalario);
				
				break;
				
			case 2:
				
				System.out.println("O cargo é Secretário");
				
				aumento = salario * 35/100;
				System.out.println("O valor do aumento é: " + aumento);
				
				novoSalario = salario + aumento;
				System.out.println("O valor do novo salário é: " + novoSalario);
				
				break;
				
			case 3:
				
				System.out.println("O cargo é Caixa");
				
				aumento = salario * 20/100;
				System.out.println("O valor do aumento é: " + aumento);
				
				novoSalario = salario + aumento;
				System.out.println("O valor do novo salário é: " + novoSalario);
				
				break;
				
			case 4:
				
				System.out.println("O cargo é Gerente");
				
				aumento = salario * 10/100;
				System.out.println("O valor do aumento é: " + aumento);
				
				novoSalario = salario + aumento;
				System.out.println("O valor do novo salário é: " + novoSalario);
				
				break;
				
			case 5:
				
				System.out.println("O cargo é Diretor");
				
				aumento = 0;
				System.out.println("O valor do aumento é: " + aumento);
				
				novoSalario = salario + aumento;
				System.out.println("O valor do novo salário é: " + novoSalario);
				
				break;
				
			default:
				System.out.println("Cargo inválido!");
				
		}
		
	}
}