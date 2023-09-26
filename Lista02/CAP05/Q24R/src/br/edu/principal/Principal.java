package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        double sal, imp, aum, novo_sal;

        do {
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1- Imposto");
            System.out.println("2- Novo Salário");
            System.out.println("3- Classificação");
            System.out.println("4- Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            op = scanner.nextInt();

            if (op > 4 || op < 1) {
                System.out.println("Opção inválida!");
            }

            if (op == 1) {
                System.out.print("Digite o salário: ");
                sal = scanner.nextDouble();
                if (sal < 500) {
                    imp = sal * 5 / 100;
                } else if (sal >= 500 && sal <= 850) {
                    imp = sal * 10 / 100;
                } else {
                    imp = sal * 15 / 100;
                }
                System.out.println("Imposto: " + imp);
            }

            if (op == 2) {
                System.out.print("Digite o salário: ");
                sal = scanner.nextDouble();
                if (sal > 1500) {
                    aum = 25;
                } else if (sal >= 750 && sal <= 1500) {
                    aum = 50;
                } else if (sal >= 450 && sal < 750) {
                    aum = 75;
                } else {
                    aum = 100;
                }
                novo_sal = sal + aum;
                System.out.println("Novo salário: " + novo_sal);
            }

            if (op == 3) {
                System.out.print("Digite o salário: ");
                sal = scanner.nextDouble();
                if (sal <= 700) {
                    System.out.println("Mal Remunerado");
                } else {
                    System.out.println("Bem Remunerado");
                }
            }

        } while (op != 4);
    }
}