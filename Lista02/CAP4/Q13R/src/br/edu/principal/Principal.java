package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choicemenu=0;
		do {
			System.out.println("Escolha uma opção");
			System.out.println("[1] Imposto");
			System.out.println("[2] Novo Salário");
			System.out.println("[3] Classificação");
			System.out.print("Digite aqui: ");
			choicemenu = scanner.nextInt();
			if(choicemenu <1 | choicemenu > 3) {
				System.out.println("Digite uma opção valida.");
			}
			
		}while(choicemenu <1 | choicemenu > 3);
		if (choicemenu==1) {
			System.out.println("Digite o valor do salário: ");
			double sal = scanner.nextDouble();
			if(sal<500) {
				double imp = sal*5/100;
				System.out.println("O valor do imposto é de: R$"+imp);
			}
			else if(sal>=500 & sal<=850) {
				double imp = sal*10/100;
				System.out.println("O valor do imposto é de: R$"+imp);
			}
			else if(sal>850) {
				double imp = sal*15/100;
				System.out.println("O valor do imposto é de: R$"+imp);
	
			}
		}
		if (choicemenu==2) {
			System.out.println("Digite o valor do salário: ");
			double sal = scanner.nextDouble();
			if(sal>1500) {
				double newsal = sal+25;
				System.out.println("O valor do novo salário é de: R$"+newsal);
			}
			if(sal<1500 & sal>=750) {
				double newsal = sal+50;
				System.out.println("O valor do novo salário é de: R$"+newsal);
				
			}
			else if(sal<750 & sal>=450) {
				double newsal = sal+75;
				System.out.println("O valor do novo salário é de: R$"+newsal);
			}
			else if(sal<1500) {
				double newsal = sal+100;
				System.out.println("O valor do novo salário é de: R$"+newsal);
			}
			
		}
		if (choicemenu==3) {
			System.out.println("Digite o valor do salário: ");
			double sal = scanner.nextDouble();
			if(sal<=700) {
				System.out.println("Mal remunerado.");
			}
			else if(sal>700) {
				System.out.println("Bem remunerado.");
				
			}
		}

	}

}
