package br.edu.principal;

import br.edu.util.Rotina;

public class Principal {

	public static void main(String[] args) {
        int[] vet = new int[3];
        Rotina.perfeitos(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

}
