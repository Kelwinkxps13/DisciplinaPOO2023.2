package br.edu.util;

public class Rotina {
	public static void perfeitos(int[] v) {
        int num = 1;
        int cont = 0;

        while (cont < 3) {
            int soma = 0;

            for (int a = 1; a < num; a++) {
                if (num % a == 0) {
                    soma += a;
                }
            }

            if (soma == num) {
                v[cont] = num;
                cont++;
            }

            num++;
        }
    }
}
