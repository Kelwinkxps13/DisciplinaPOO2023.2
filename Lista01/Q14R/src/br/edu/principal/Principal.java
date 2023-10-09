package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        int anoAtual, anoNascimento;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();
        
        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();
        
        System.out.println("A sua idade atual é: " + (anoAtual - anoNascimento));
        
        System.out.println("A sua idade em 2050 será: " + (2050 - anoNascimento));
    }
    
}