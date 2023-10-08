package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	 public static void main(String[] args) {
	        int[] corredor = new int[24];
	        int[] janela = new int[24];
	        Scanner scanner = new Scanner(System.in);
	        int op=0;
	        int posicao=0;
	        int num=0;
	        
	        for (int i = 0; i < 24; i++) {
	            corredor[i] = 0;
	            janela[i] = 0;
	        }

	        do {
	            System.out.println("[1]- Vender passagem");
	            System.out.println("[2]- Mostrar mapa de ocupação do ônibus");
	            System.out.println("[3]- Encerrar");
	            op = scanner.nextInt();

	            if (op == 1) {
	                boolean achou = false;
	                
	                do {
	                    System.out.println("Escolha");
	                    System.out.println("[1] Janela");
	                    System.out.println("[2] Corredor");
	                    posicao = scanner.nextInt();
	                    if(posicao != 1 && posicao != 2) {
	                        System.out.println("Escolha errada.");
	                    }
	                } while(posicao != 1 && posicao != 2);
	               
					
					do {
						System.out.println("Digite uma poltrona entre 1 e 24:");
		                num = scanner.nextInt();
		                if(num<1 | num>24) {
		                	System.out.println("escolha errada");
		                }
					}while(num<1 | num>24);
	                

	                if ((posicao == 1 && janela[num - 1] == 0) || (posicao == 2 && corredor[num - 1] == 0)) {
	                    achou = true;
	                    System.out.println("Venda efetivada");
	                    if (posicao == 1) {
	                        janela[num - 1] = 1;
	                    } else {
	                        corredor[num - 1] = 1;
	                    }
	                }
	                
	                
	                
	                int assentosOcupados = 0;
					if (achou) {
	                    assentosOcupados++;
	                }
					if (assentosOcupados >= 48) {
	                    System.out.println("Ônibus lotado!");
	                    break;
	                }

	                
	                
	                if (!achou) {
	                    System.out.println("Poltrona ocupada");
	                }
	                
	                
	            } else if (op == 2) {
	                System.out.println("JANELA   CORREDOR");
	                for (int i = 0; i < 24; i++) {
	                    System.out.print((i + 1) + "- ");
	                    if (janela[i] == 1) {
	                        System.out.print("Ocupada   ");
	                    } else {
	                        System.out.print("Livre     ");
	                    }
	                    if (corredor[i] == 1) {
	                        System.out.println("Ocupada");
	                    } else {
	                        System.out.println("Livre");
	                    }
	                }
	            }

	        } while (op != 3);
	    }

}
