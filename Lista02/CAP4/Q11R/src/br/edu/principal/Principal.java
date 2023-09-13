package br.edu.principal;

import java.util.Calendar;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		long horai, mini, horaf, minf;
		System.out.println("Digite o horário inicial");
		System.out.println("Hora: ");
		horai = scanner.nextLong();
		System.out.println("Minuto: ");
		mini = scanner.nextLong();
		System.out.println("Digite o horário final");
		System.out.println("Hora: ");
		horaf = scanner.nextLong();
		System.out.println("Minuto: ");
		minf = scanner.nextLong();
		if(mini>minf) {
			minf+=60;
			horaf-=1;
		}
		if (horai>horaf) {
			horaf+=24;
		}
		long mint = minf - mini;
		long horat = horaf - horai;
		System.out.println("O jogo durou "+horat+" hora(s) e "+mint+" minuto(s)");


	}

}
