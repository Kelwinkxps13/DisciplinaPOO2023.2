package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int cont, aprovado=0, exame=0, reprovado=0;
        double n1, n2, media, totalClasse, mediaClasse;
        
        Scanner sc = new Scanner(System.in);
        
        totalClasse = 0;

        for (cont = 1; cont <= 6; cont++) {
            
        	System.out.print("Digite a nota 1 do aluno " + cont + ": ");
            n1 = sc.nextDouble();
            System.out.print("Digite a nota 2 do aluno " + cont + ": ");
            n2 = sc.nextDouble();

            media = (n1 + n2) / 2;
            System.out.println("Média do aluno " + cont + ": " + media);

            if (media <= 3) {
                reprovado++;
                System.out.println("Reprovado");
            } else if (media > 3 && media < 7) {
                exame++;
                System.out.println("Exame");
            } else {
                aprovado++;
                System.out.println("Aprovado");
            }

            totalClasse += media;
        }

        System.out.println("A quantidade de reprovados é: " + reprovado);
        System.out.println("A quantidade de exames é: " + exame);
        System.out.println("A quantidade de aprovados é: " + aprovado);

        mediaClasse = totalClasse / 6;
        System.out.println("A média da classe é: " + mediaClasse);


	}

}