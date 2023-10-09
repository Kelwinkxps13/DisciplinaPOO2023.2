package br.edu.principal;

import java.util.Scanner;

import br.edu.util.Uniao;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int cont;

        System.out.println("Digite 10 números inteiros positivos para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            do {
                vet1[i] = scanner.nextInt();
            } while (vet1[i] < 0);
        }

        System.out.println("Digite 10 números inteiros positivos para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            do {
                vet2[i] = scanner.nextInt();
            } while (vet2[i] < 0);
        }

        cont = Uniao.uniao(vet1, vet2, vet3);

        System.out.println("Vetor união dos dois primeiros vetores:");
        for (int i = 0; i < cont; i++) {
            System.out.print(vet3[i] + " ");
        }

    }

    

}
