package br.edu.principal;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("o código do estado de origem da carga de um caminhão");
		double codest = scanner.nextDouble();
		System.out.println("o peso da carga do caminhão em toneladas");
		double pesotol = scanner.nextDouble();
		System.out.println("o código da carga");
		double codcarga = scanner.nextDouble();
		double pesoquilos = pesotol*1000;
		System.out.println(pesoquilos);
		double precocarga=0;
		if(codcarga>=10 & codcarga<=20) {
			precocarga = pesoquilos*100;
		}
		else if(codcarga>=21 & codcarga<=30) {
			precocarga = pesoquilos*250;
		}
		else if(codcarga>=31 & codcarga<=40) {
			precocarga = pesoquilos*340;
		}
		System.out.println(precocarga);
		double imp=0;
		if(codest==1) {
			imp = precocarga*35/100;
		}
		if(codest==2) {
			imp = precocarga*25/100;
		}
		if(codest==3) {
			imp = precocarga*15/100;
		}
		if(codest==4) {
			imp = precocarga*5/100;
		}
		if(codest==5) {
			imp = 0;
		}
		System.out.println(imp);
		double vlrtotal = precocarga+imp;
		System.out.println(vlrtotal);
		

	}

}
