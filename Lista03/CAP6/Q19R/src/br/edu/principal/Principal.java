package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		String a1[] = new String[20];
		String b1[] = new String[20];
		String aux = "";
		System.out.println("Vetores Antes:\n");
		for (int i=0;i<a1.length; i++) {
			a1[i]=i+"a";
			System.out.println("A posição "+i+" do vetor A está ocupada por: "+a1[i]);
		}
		System.out.println("");
		for (int i=0;i<b1.length; i++) {
			b1[i]=i+"b";
			System.out.println("A posição "+i+" do vetor B está ocupada por: "+b1[i]);
		}
		int j = 19;
		for (int i=0; i<a1.length; i++) {
			aux = a1[i];
			a1[i] = b1[j];
			b1[j] = aux;
			j--;
		}
		
		System.out.println("Vetores Depois:\n");
		for (int i=0;i<a1.length; i++) {
			System.out.println("A posição "+i+" do vetor A está ocupada por: "+a1[i]);
		}
		System.out.println("");
		for (int i=0;i<b1.length; i++) {
			System.out.println("A posição "+i+" do vetor B está ocupada por: "+b1[i]);
		}
		
		

	}

}
