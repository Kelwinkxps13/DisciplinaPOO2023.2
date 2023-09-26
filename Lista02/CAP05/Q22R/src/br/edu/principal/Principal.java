package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, cont_f1 = 0, menor_idade = 0;
        double media_idade = 0.0, perc = 0.0;
        String sexo, exp;

        int tot = 0;

        while (true) {
            System.out.print("Digite a idade (0 para encerrar): ");
            idade = scanner.nextInt();
            
            if (idade == 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.next();

            System.out.print("Digite a experiência (S/N): ");
            exp = scanner.next();

            if (sexo.equals("F") && exp.equals("S")) {
                if (tot == 0) {
                    menor_idade = idade;
                    tot = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
            }

            if (sexo.equals("M")) {
                tot_m++;

                if (idade > 45) {
                    cont_m1++;
                }

                if (exp.equals("S")) {
                    soma1 += idade;
                    cont_m2++;
                }
            }

            if (sexo.equals("F") && idade < 21 && exp.equals("S")) {
                cont_f1++;
            }
        }

        System.out.println("Total de mulheres: " + tot_f);
        System.out.println("Total de homens: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência");
        } else {
            media_idade = (double) soma1 / cont_m2;
            System.out.println("Média de idade dos homens com experiência: " + media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem");
        } else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.println("Percentagem de homens com mais de 45 anos: " + perc + "%");
        }

        System.out.println("Total de mulheres com menos de 21 anos e experiência: " + cont_f1);
        System.out.println("Menor idade entre as mulheres com experiência: " + menor_idade);
    }
}