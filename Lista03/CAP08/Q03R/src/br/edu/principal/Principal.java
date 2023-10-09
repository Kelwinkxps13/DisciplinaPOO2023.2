package br.edu.principal;

import java.util.Scanner;

import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        
        do {
            System.out.println("Digite um número inteiro maior que 1 para 'a':");
            a = scanner.nextInt();
        } while (a <= 1);
        
        System.out.println("Digite dois números inteiros para 'b' e 'c' (em ordem):");
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        int result = Uteis.divisores(a, b, c);
        System.out.println("Soma dos inteiros = " + result);
    }

    

}
