package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        int soma = 0, qtde = 0;
        boolean achouPar = false, achouImpar = false;

        System.out.println("Digite 6 números inteiros:");

        for (int i = 0; i < 6; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("Relatório:");
        System.out.println("Os números pares são:");
        for (int i = 0; i < 6; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("número " + num[i] + " na posição " + (i + 1));
                soma += num[i];
                achouPar = true;
            }
        }
        if (!achouPar) {
            System.out.println("Nenhum número par foi digitado");
        } else {
            System.out.println("Soma dos pares = " + soma);
        }

        System.out.println("Os números ímpares são:");
        for (int i = 0; i < 6; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("número " + num[i] + " na posição " + (i + 1));
                qtde++;
                achouImpar = true;
            }
        }
        if (!achouImpar) {
            System.out.println("Nenhum número ímpar foi digitado");
        } else {
            System.out.println("Quantidade de ímpares = " + qtde);
        }

	}

}
