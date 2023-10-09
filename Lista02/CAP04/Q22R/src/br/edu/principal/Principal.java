package br.edu.principal;

import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
    	
        double salarioBase, tempoDeServico, imposto=0, gratificacao, salarioLiquido;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário base do funcionário: ");
        salarioBase = sc.nextDouble();
        
        System.out.print("Digite o tempo de servico do funcionário: ");
        tempoDeServico = sc.nextDouble();
        
        if (salarioBase < 200) {
        	imposto = 0;
        }
        else if (salarioBase <= 450) {
        	imposto = salarioBase * 3/100;
        }
        else if (salarioBase < 700) {
            imposto = salarioBase * 8/100;
        }
        else {
        	imposto = salarioBase * 12/100;
        }
        System.out.println("O imposto é: " + imposto);
        
        if (salarioBase > 500) {
        	if (tempoDeServico <= 3){
        		gratificacao = 20;
        	}
        	else {
        		gratificacao = 30;
        	}
        }
        else {
        	if (tempoDeServico <= 3) {
        		gratificacao = 23;
        	}
        	else if (tempoDeServico  < 6) {
        		gratificacao = 35;
        	}
        	else {
        		gratificacao = 33;
        	}
        	
        }
        System.out.println("A gratificação é: " + gratificacao);
        
        salarioLiquido = salarioBase - imposto + gratificacao;
        System.out.println("O salário líquido é: " + salarioLiquido);
        
        if (salarioLiquido <= 350){
        	System.out.println("Classificação A");
        }
        else if (salarioLiquido < 600) {
        	System.out.println("Classificação B");
        }
        else {
        	System.out.println("Classificação C");
        }    
    }
}