package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("de a medida do angulo em graus: ");
		double angulo = scanner.nextDouble();
		int voltas =0;
		if(angulo>360 | angulo<-360) {
			voltas = (int)angulo/360;
			angulo = angulo%360;
		}
		else {
			voltas=0;
		}
		if(angulo==0 | angulo==90 | angulo==180 | angulo==270 | angulo==360 | angulo==-90 | angulo==-180 | angulo==-270 | angulo==-360) {
			System.out.println("Está em cima de algum dos eixos");
		}
		if ((angulo>0 & angulo<90) | (angulo<-270 & angulo>-360)) {
			System.out.println("1° quadrante");
		}
		else if ((angulo>90 & angulo<190) | (angulo<-180 & angulo>-270)) {
			System.out.println("2° quadrante");
		}
		else if ((angulo>180 & angulo<270) | (angulo<-90 & angulo>-180)) {
			System.out.println("3° quadrante");
		}
		else if ((angulo>270 & angulo<360) | (angulo<0 & angulo>-90)) {
			System.out.println("4° quadrante");
		}
		System.out.print(voltas+" voltas no sentido ");
		if (angulo<0) {
			System.out.println("Horário");
		}
		else {
			System.out.println("Anti-horário");
		}
	}

}
