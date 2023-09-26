package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int cod, num_h, cont_m = 0, cont_f = 0;
        double sal_b, sal_l = 0, media_m = 0, media_f = 0;
        String sexo;

        System.out.print("Informe o código (ou 99999 para encerrar): ");
        cod = scanner.nextInt();

        while (cod != 99999) {
            System.out.print("Informe o sexo (M/F): ");
            sexo = scanner.next();
            System.out.print("Informe o número de horas/aula mensal: ");
            num_h = scanner.nextInt();

            sal_b = num_h * 30;

            if (sexo.equals("M")) {
                sal_l = sal_b - (sal_b * 0.10);
                media_m += sal_l;
                cont_m++;
            } else if (sexo.equals("F")) {
                sal_l = sal_b - (sal_b * 0.05);
                media_f += sal_l;
                cont_f++;
            }

            System.out.println("Código: " + cod);
            System.out.println("Salário Bruto: " + sal_b);
            System.out.println("Salário Líquido: " + sal_l);

            System.out.print("Informe o código (ou 99999 para encerrar): ");
            cod = scanner.nextInt();
        }

        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino");
        } else {
            media_m /= cont_m;
            System.out.println("Média dos salários líquidos dos professores do sexo masculino: " + media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino");
        } else {
            media_f /= cont_f;
            System.out.println("Média dos salários líquidos dos professores do sexo feminino: " + media_f);
        }

    }
}