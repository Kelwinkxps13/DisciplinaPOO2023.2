package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		long qtdVotos=0, qtdVotos1=0, qtdVotos2=0, qtdVotos3=0, qtdVotos4=0, qtdVotosNulo=0, qtdVotosBranco=0;
		double porcentagemNulo, porcentagemBranco, voto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os códigos dos votos (1, 2, 3, 4, 5, 6), digite \"0\" (sem aspas) para terminar a coleta dos códigos:");
		
		do {
			
			voto = sc.nextDouble();
			
			if (voto == 1) {
				qtdVotos++;
				qtdVotos1++;
			}
			else if (voto == 2) {
				qtdVotos++;
				qtdVotos2++;
			}
			else if (voto == 3) {
				qtdVotos++;
				qtdVotos3++;
			}
			else if (voto == 4) {
				qtdVotos++;
				qtdVotos4++;
			}
			else if (voto == 5) {
				qtdVotos++;
				qtdVotosNulo++;
			}
			else if (voto == 6) {
				qtdVotos++;
				qtdVotosBranco++;
			}
			else if (voto != 0) {
				System.out.println("Este código é inválido!");
			}
			
		} while (voto != 0);
		
		porcentagemNulo = 100.0 * qtdVotosNulo / qtdVotos;
		porcentagemBranco = 100.0 * qtdVotosBranco / qtdVotos;
		
		System.out.println("O total de votos do candidato 1 foi: " + qtdVotos1);
		System.out.println("O total de votos do candidato 2 foi: " + qtdVotos2);
		System.out.println("O total de votos do candidato 3 foi: " + qtdVotos3);
		System.out.println("O total de votos do candidato 4 foi: " + qtdVotos4);
		System.out.println("O total de votos nulo foi: " + qtdVotosNulo);
		System.out.println("O total de votos branco foi: " + qtdVotosBranco);
		System.out.println("A porcentagem de votos nulo foi de: " + porcentagemNulo + "%");
		System.out.println("A porcentagem de votos branco foi de: " + porcentagemBranco + "%");
		
	}
	
}