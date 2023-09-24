package br.edu.principal;   

import java.util.Scanner; 

public class Principal { 
	
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int conttime, contjog, idade, qtde = 0, tot80 = 0; 
        double peso, alt, midade, maltura = 0, porc; 
        for (conttime = 1; conttime <= 5; conttime++) { 
            midade = 0; 
            maltura = 0; 
            for (contjog = 1; contjog <= 11; contjog++) { 
                idade = scanner.nextInt(); 
                peso = scanner.nextDouble(); 
                alt = scanner.nextDouble();
                if (idade < 18) { 
                    qtde++; 
                } 
                midade += idade; 
                maltura += alt; 
                if (peso > 80) { 
                    tot80++; 
                } 
            } 
            midade /= 11; 
            maltura /= 11; 
            System.out.println(midade); 
        } 
        System.out.println(qtde); 
        System.out.println(maltura); 
        porc = (tot80 * 100.0) / 55; 
        System.out.println(porc); 
    } 
} 
