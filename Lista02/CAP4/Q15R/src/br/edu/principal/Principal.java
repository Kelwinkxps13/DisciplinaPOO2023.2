package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double salmin, horat, depfun,horaex;
		System.out.println("valor do salário mínimo: ");
		salmin = scanner.nextDouble();
		System.out.println("número de horas trabalhadas: ");
		horat = scanner.nextDouble();
		System.out.println("número de dependentes do funcionário: ");
		depfun = scanner.nextDouble();
		System.out.println("quantidade de horas extras trabalhadas: ");
		horaex = scanner.nextDouble();
		double vlrhorat = salmin/5;
		double salmes = vlrhorat*horat;
		double vlrdepfun = depfun*32;
		double vlrhoraex = horaex * (horat+(horat*50/100));
		double salbruto = salmes+vlrdepfun+vlrhoraex;
		double imp=0;
		if(salbruto<200) {
			imp = 0;
		}
		else if (salbruto>=200 & salbruto<=500) {
			imp = salbruto*10/100;
		}
		else if(salbruto>500) {
			imp = salbruto*20/100;
		}
		double salliq = salbruto - imp;
		double grat=0;
		if (salliq<=350) {
			grat = 100;
		}
		else if (salliq>350) {
			grat = 50;
		}
		double salreceber = salliq + grat;
		System.out.println("Salário a receber: R$"+salreceber);

	}

}
