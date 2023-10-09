package br.edu.util;

public class Uteis {
	public static int divisores(int a, int b, int c) {
        int soma = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
