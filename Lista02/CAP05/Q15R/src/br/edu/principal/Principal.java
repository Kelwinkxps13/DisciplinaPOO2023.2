package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int i, qtdB = 0, qtdN = 0, qtdC = 0;
        double preco, custoEstoque, imp, precoFinal, adicional = 0, maiorPreco = 0, menorPreco = 0, totalImp = 0;
        String refrigeracao, categoria;
        
        Scanner sc = new Scanner(System.in);
        
        for (i = 1; i <= 12; i++) {
            System.out.print("Digito o preço: ");
            preco = sc.nextDouble();
            
            System.out.print("Digite se possui refrigeração (S ou N): ");
            refrigeracao = sc.next();
            
            System.out.print("Digite a categoria (A, L ou V): ");
            categoria = sc.next();

            if (preco <= 20) {
                if (categoria.equals("A")) {
                    custoEstoque = 2;
                } 
                else if (categoria.equals("L")) {
                    custoEstoque = 3;
                } 
                else if (categoria.equals("V")) {
                    custoEstoque = 4;
                } 
                else {
                    custoEstoque = 0;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refrigeracao.equals("S")) {
                    custoEstoque = 6;
                } 
                else {
                    custoEstoque = 0;
                }
            } else {
                if (refrigeracao.equals("S")) {
                    if (categoria.equals("A")) {
                        custoEstoque = 5;
                    } else if (categoria.equals("L")) {
                        custoEstoque = 2;
                    } else if (categoria.equals("V")) {
                        custoEstoque = 4;
                    } else {
                        custoEstoque = 0;
                    }
                } else {
                    if (categoria.equals("A") | categoria.equals("V")) {
                        custoEstoque = 0;
                    }
                    else if (categoria.equals("L")) {
                        custoEstoque = 1;
                    }
                    else {
                        custoEstoque = 0;
                    }
                }
            }

            if (!categoria.equals("A") & !refrigeracao.equals("S")) {
                imp = preco * 2 / 100;
            } 
            else {
                imp = preco * 4 / 100;
            }

            precoFinal = preco + custoEstoque + imp;
            System.out.println("Custo Estimado: " + custoEstoque);
            System.out.println("Imposto: " + imp);
            System.out.println("Preço Final: " + precoFinal);

            if (precoFinal <= 20) {
                qtdB++;
                System.out.println("Classificação Barato");
            } 
            else if (precoFinal > 20 & precoFinal <= 100) {
                qtdN++;
                System.out.println("Classificação Normal");
            } 
            else {
                qtdC++;
                System.out.println("Classificação Caro");
            }

            adicional += custoEstoque + imp;
            totalImp += imp;

            if (i == 1) {
                maiorPreco = precoFinal;
                menorPreco = precoFinal;
            } 
            else {
                if (precoFinal > maiorPreco) {
                    maiorPreco = precoFinal;
                }
                if (precoFinal < menorPreco) {
                    menorPreco = precoFinal;
                }
            }
        }

        adicional /= 12;
        System.out.println("Adicional Médio: " + adicional);
        System.out.println("Maior Preço Final: " + maiorPreco);
        System.out.println("Menor Preço Final: " + menorPreco);
        System.out.println("Total de Impostos: " + totalImp);
        System.out.println("Quantidade de Produtos Baratos: " + qtdB);
        System.out.println("Quantidade de Produtos Normais: " + qtdN);
        System.out.println("Quantidade de Produtos Caros: " + qtdC);


	}

}