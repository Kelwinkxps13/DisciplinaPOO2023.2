package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double vlrsalmin=0, horast=0, coefsal=0, imp=0, grat=0, auxali=0;
		String turno="", categoria="";
		System.out.println("valor salario minimo: ");
		vlrsalmin = scanner.nextDouble();
		System.out.println("turno do trabalho");
		turno = scanner.next();
		System.out.println("Categoria: ");
		categoria = scanner.next();
		System.out.println("horas trabalhadas: ");
		horast = scanner.nextDouble();
		
		if (turno.equals("M")) {
			coefsal = vlrsalmin*10/100;
		}
		else if (turno.equals("V")) {
			coefsal = vlrsalmin*15/100;
		}
		else if (turno.equals("N")) {
			coefsal = vlrsalmin*12/100;
		}
		System.out.println("Coefsal: ");
		System.out.println(coefsal);
		double salbruto = horast*coefsal;
		System.out.println("Salbruto: ");
		System.out.println(salbruto);
		if (categoria.equals("O")) {
			if(salbruto>=300) {
				imp = salbruto*5/100;
			}
			else if (salbruto<300) {
				imp = salbruto*3/100;
			}
		}
		else if (categoria.equals("G")) {
			if(salbruto>=400) {
				imp = salbruto*6/100;
			}
			else if (salbruto<400) {
				imp = salbruto*4/100;
			}
		}
		System.out.println("Imposto: ");
		System.out.println(imp);
		if(turno.equals("N") & horast>80) {
			grat = 50;
		}
		else {
			grat = 30;
		}
		System.out.println("gratificação");
		System.out.println(grat);
		if(categoria.equals("O") | coefsal<=25) {
			auxali = salbruto*1/3;
		}
		else {
			auxali = salbruto*1/2;
		}
		System.out.println("auxilio alimentacao: ");
		System.out.println(auxali);
		double salliq=0;
		salliq = salbruto-imp+grat+auxali;
		System.out.println("Salliq: ");
		System.out.println(salliq);
		if(salliq<350) {
			System.out.println("Mal Remunerado");
		}
		else if(salliq>=350 & salliq<=600) {
			System.out.println("Normal");
		}
		else if(salliq>600) {
			System.out.println("Bem Remunerado");
		}
	}

}
