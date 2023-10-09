package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
        
        double preco, imp, valorTransporte, seguro, precoFinal, totalImp = 0;
        int origem;
        String meioTransporte, carga;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: ");
        preco = sc.nextDouble();

        while (preco > 0) {
            System.out.print("Digite o país de origem (1, 2, ou 3): ");
            origem = sc.nextInt();

            System.out.print("Digite o meio de transporte (A ou B): ");
            meioTransporte = sc.next();

            System.out.print("Digite 'S' para carga perigosa ou 'N' para carga normal: ");
            carga = sc.next();

            if (preco <= 100) {
                imp = preco * 5 / 100;
            }
            else {
                imp = preco * 10 / 100;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    valorTransporte = 50;
                } 
                else if (origem == 2) {
                    valorTransporte = 21;
                } 
                else if (origem == 3) {
                    valorTransporte = 24;
                } else {
                    valorTransporte = 0;
                }
            } else {
                if (origem == 1) {
                    valorTransporte = 12;
                } 
                else if (origem == 2) {
                    valorTransporte = 21;
                } 
                else if (origem == 3) {
                    valorTransporte = 60;
                } 
                else {
                    valorTransporte = 0;
                }
            }

            if (origem == 2 || meioTransporte.equals("A")) {
                seguro = preco / 2;
            }
            else {
                seguro = 0;
            }

            precoFinal= preco + imp + valorTransporte + seguro;
            totalImp += imp;

            System.out.println("O imposto é: " + imp);
            System.out.println("O transporte é: " + valorTransporte);
            System.out.println("O seguro é: " + seguro);
            System.out.println("O preço final é: " + precoFinal);

            System.out.print("Digite o preço do produto: ");
            preco = sc.nextDouble();
        }

        System.out.println("Total de impostos: " + totalImp);

    }
}