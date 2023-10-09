package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[][] prod = new int[5][4];
        
        System.out.println("Digite o estoque atual de três produtos em quatro armazéns:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                prod[j][i] = scanner.nextInt();
            }
        }
        
        System.out.println("Digite o custo de cada produto:");
        for (int i = 0; i < 3; i++) {
            prod[3][i] = scanner.nextInt();
        }
        
        int menorEstoque = Integer.MAX_VALUE;
        int indiceMenorEstoque = -1;
        int maiorEstoqueProduto2 = 0;
        int indiceMaiorEstoqueProduto2 = -1;
        
        for (int i = 0; i < 4; i++) {
            int totalArmazem = 0;
            for (int j = 0; j < 3; j++) {
                totalArmazem += prod[j][i];
            }
            System.out.println("O total de itens no armazém " + (i + 1) + " = " + totalArmazem);
            
            if (totalArmazem < menorEstoque) {
                menorEstoque = totalArmazem;
                indiceMenorEstoque = i;
            }
            
            if (prod[1][i] > maiorEstoqueProduto2) {
                maiorEstoqueProduto2 = prod[1][i];
                indiceMaiorEstoqueProduto2 = i;
            }
        }
        
        System.out.println("Armazém com menor estoque: " + (indiceMenorEstoque + 1));
        System.out.println("O maior estoque do produto 2 está no armazém " + (indiceMaiorEstoqueProduto2 + 1));
        
        for (int i = 0; i < 3; i++) {
            int custoProduto = 0;
            for (int j = 0; j < 4; j++) {
                custoProduto += prod[j][i];
            }
            custoProduto *= prod[3][i];
            System.out.println("O custo total do produto " + (i + 1) + " = " + custoProduto);
        }
        
        for (int i = 0; i < 4; i++) {
            int custoArmazem = 0;
            for (int j = 0; j < 3; j++) {
                custoArmazem += prod[j][i] * prod[3][j];
            }
            System.out.println("O custo total do armazém " + (i + 1) + " = " + custoArmazem);
        }

	}

}
