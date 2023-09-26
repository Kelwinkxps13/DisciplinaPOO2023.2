package br.edu.principal;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		int dia, mes, ano, hora, min;
		Calendar calendar = Calendar.getInstance();
		
		dia = calendar.get(Calendar.DAY_OF_MONTH);
		mes = calendar.get(Calendar.MONTH)+1;
		ano = calendar.get(Calendar.YEAR);
		hora = calendar.get(Calendar.HOUR);
		min = calendar.get(Calendar.MINUTE);
		System.out.print("A data atual é: "+dia+"/"+mes+"/"+ano+" - ");
		
		if (mes==1) {
			System.out.println("Janeiro");
		}
		if (mes==2) {
			System.out.println("Fevereiro");
		}
		if (mes==3) {
			System.out.println("Março");
		}
		if (mes==4) {
			System.out.println("Abril");
		}
		if (mes==5) {
			System.out.println("Maio");
		}
		if (mes==6) {
			System.out.println("Junho");
		}
		if (mes==7) {
			System.out.println("Julho");
		}
		if (mes==8) {
			System.out.println("Agosto");
		}
		if (mes==9) {
			System.out.println("Setembro");
		}
		if (mes==10) {
			System.out.println("Outubro");
		}
		if (mes==11) {
			System.out.println("Novembro");
		}
		if (mes==12) {
			System.out.println("Dezembro");
		}
		System.out.println("Hora atual: "+hora+":"+min);
	}

}
