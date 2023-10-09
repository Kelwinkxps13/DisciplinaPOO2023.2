package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
	public static void main(String[] args) {
       
    	long fim, i, j, expoente, numTermos, denominador;
        double x, den=0, fat, s;

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Digite o numero de termos: ");
        numTermos = sc.nextLong();
       
        System.out.print("Digite um numero para x: ");
        x = sc.nextDouble();

        s = 0;
        denominador = 1;

        for (i = 1; i <= numTermos; i++) {
            fim = denominador;
            fat = 1;

            for (j = 1; j <= fim; j++) {
                fat *= j;
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador += 1;
            } else {
                denominador -= 1;
            }
        }

        System.out.println("O valor da serie e: " + s);
    }
}