package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = 0;

        double minmax = Double.MIN_VALUE;
        int linha = 0;

        double m[][] = new double[4][7];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Digite o numero da posicao linha " + i + " coluna " + j + ":");
                x = scanner.nextDouble();
                m[i][j] = x;
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            double minLinha = Double.MAX_VALUE;
            for (int j = 0; j < 7; j++) {
                if (m[i][j] < minLinha) {
                    minLinha = m[i][j];
                }
            }
            if (minLinha > minmax) {
                minmax = minLinha;
                linha = i;
            }
        }

        System.out.println("O minmax é: " + minmax + " e se localiza na linha " + linha);
    }
}