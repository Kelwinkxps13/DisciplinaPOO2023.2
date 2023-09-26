package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int totalIdadeOtimo = 0;
        int totalRegular = 0;
        int totalBom = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Resposta do espectador " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Opinião (ótimo=3, bom=2, regular=1): ");
            int opiniao = scanner.nextInt();
            
            if (opiniao == 3) {
                totalIdadeOtimo += idade;
            } else if (opiniao == 2) {
                totalBom++;
            } else if (opiniao == 1) {
                totalRegular++;
            }
        }
        
        if (totalIdadeOtimo > 0) {
            double mediaIdadeOtimo = totalIdadeOtimo / 15;
            System.out.println("Média das idades das pessoas que responderam ótimo: " + mediaIdadeOtimo);
        } else {
            System.out.println("Ninguém respondeu ótimo.");
        }
        
        System.out.println("Quantidade de pessoas que responderam regular: " + totalRegular);
        
        double percentagemBom =  totalBom * 100 / 15;
        System.out.println("Percentagem de pessoas que responderam bom: " + percentagemBom + "%");

	}

}
