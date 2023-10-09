package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
        long i, numCriancas, meses, totalMasculino, totalFeminino, total24;
        double porcentoMasculino, porcentoFeminino, porcento24;
        String sexo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de crianças nascidas no período: ");
        numCriancas = sc.nextLong();

        totalMasculino = 0;
        totalFeminino = 0;
        total24 = 0;

        for (i = 1; i <= numCriancas; i++) {
        	System.out.print("Digite o sexo da " + i + "° criança (M/F): ");
            sexo = sc.next();
            
            System.out.print("Digite o tempo de vida (em meses) da " + i + "° criança: ");
            meses = sc.nextLong();

            if (sexo.equals("M")) {
            	totalMasculino++;
            } else if (sexo.equals("F")) {
                totalFeminino++;
            }

            if (meses <= 24) {
                total24++;
            }
        }

        porcentoMasculino = totalMasculino * 100.0 / numCriancas;
        porcentoFeminino = totalFeminino * 100.0 / numCriancas;
        porcento24 = total24 * 100.0 / numCriancas;

        System.out.println("O percentual de crianças do sexo feminino mortas: " + porcentoFeminino + "%");
        System.out.println("O percentual de crianças do sexo masculino mortas: " + porcentoMasculino + "%");
        System.out.println("O percentual de crianças com 24 meses ou menos mortas no período: " + porcento24 + "%");
    }
}