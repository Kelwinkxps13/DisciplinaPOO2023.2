package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtdPessoas = 10;
		String sexo="";
		String decisao = "";
		int qtdSim = 0;
		int qtdNao = 0;
		int qtdMulherSim = 0;
		int qtdHomemNao = 0;
		int qtdHomem = 0;
		
		for(int i=1; i<=qtdPessoas; i++) {
			System.out.println("Pessoa "+i);
			System.out.println("Sexo (M - masculino ou F - feminino): ");
			sexo = scanner.nextLine();
			System.out.println("Gostou? (S - sim ou N - não): ");
			decisao = scanner.nextLine();
			if (decisao.equals("S")) {
				qtdSim ++;
			}if (decisao.equals("N")) {
				qtdNao ++;
			}if (sexo.equals("F") & decisao.equals("S")) {
				qtdMulherSim++;
			}if (sexo.equals("M") & decisao.equals("N")) {
				qtdHomemNao++;
			}if (sexo.equals("M")) {
				System.out.println("homem");
				qtdHomem ++;
			}
		}
		
		if(qtdSim>0) {
			System.out.println("Quantidade de pessoas que responderam sim: "+qtdSim);
		}else {
			System.out.println("Ninguem votou sim.");
		}if(qtdNao>0) {
			System.out.println("Quantidade de pessoas que responderam não: "+qtdNao);
		}else {
			System.out.println("Ninguem votou não.");
		}if(qtdMulherSim>0) {
			System.out.println("Quantidade de mulheres que responderam sim: "+qtdMulherSim);
		}else {
			System.out.println("Nenhuma Mulher votou sim.");
		}if(qtdHomem>0) {
			double porcHomemNao = qtdHomemNao*100/qtdHomem;
			System.out.println("Porcentagem de homens responderam não: "+porcHomemNao+"%");
		}else {
			System.out.println("Nenhum homem votou não.");
		}

	}

}
