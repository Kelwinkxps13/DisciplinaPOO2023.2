package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        
        double sal, qtd, valorKw, gasto, acrescimo = 0, total, totalGeral;
        int qtdCons, tipo;

        Scanner sc = new Scanner(System.in);
        
        totalGeral = 0;
        qtdCons = 0;

        System.out.print("Digite o salário: ");
        sal = sc.nextDouble();
        System.out.print("Digite a quantidade de consumo de energia: ");
        qtd = sc.nextDouble();
        valorKw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valorKw;
            System.out.print("Digite o tipo (1, 2 ou 3): ");
            tipo = sc.nextInt();

            switch (tipo) {
            
            case 1:
            	acrescimo = gasto * 5 / 100;
            	break;
            case 2:
            	acrescimo = gasto * 10 / 100;
            	break;
            case 3:
            	acrescimo = gasto * 15 / 100;
            	break;
            }
            

            total = gasto + acrescimo;
            totalGeral += total;

            if (total >= 500 & total <= 1000) {
                qtdCons++;
            }

            System.out.println("O gasto é: " + gasto);
            System.out.println("O acrescimento é: " + acrescimo);
            System.out.println("O total é: " + total);

            System.out.print("Digite a quantidade de consumo de energia: ");
            qtd = sc.nextDouble();
        }

        System.out.println("O total geral é: " + totalGeral);
        System.out.println("Quantidade de consumos com total entre 500 e 1000: " + qtdCons);

    }
}