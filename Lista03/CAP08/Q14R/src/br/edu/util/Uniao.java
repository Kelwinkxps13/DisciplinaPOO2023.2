package br.edu.util;

public class Uniao {
	public static int uniao(int[] a, int[] b, int[] u) {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            boolean existe = false;
            for (int j = 0; j < k; j++) {
                if (a[i] == u[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                u[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean existe = false;
            for (int j = 0; j < k; j++) {
                if (b[i] == u[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                u[k] = b[i];
                k++;
            }
        }

        return k;
    }
}
