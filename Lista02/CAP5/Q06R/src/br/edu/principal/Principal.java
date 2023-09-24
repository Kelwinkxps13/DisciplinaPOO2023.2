package br.edu.principal; 

 

import java.util.Scanner; 

 

public class Principal { 

    public static void main(String[] args) { 

        int cont, codigo, horat; 
        double vlr, salmin, salInicial, aux, salfinal; 
        String turno, categoria; 
        Scanner scanner = new Scanner(System.in);
        salmin = 450; 
        for (cont = 1; cont <= 10; cont++) { 
            codigo = scanner.nextInt(); 
            horat = scanner.nextInt(); 
            turno = scanner.next(); 
            categoria = scanner.next(); 
            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) { 
                turno = scanner.next(); 
            } 
            while (!categoria.equals("G") && !categoria.equals("O")) { 
                categoria = scanner.next(); 
            } 
            if (categoria.equals("G")) { 
                if (turno.equals("N")) { 
                    vlr = salmin * 18 / 100; 
                } else { 
                    vlr = salmin * 15 / 100; 
                } 
            } else { 
                if (turno.equals("N")) { 
                    vlr = salmin * 13 / 100; 
                } else { 
                    vlr = salmin * 10 / 100; 
                } 
            } 
            salInicial = horat * vlr; 
            if (salInicial <= 300) { 
                aux = salInicial * 20 / 100; 
            } else if (salInicial < 600) { 
                aux = salInicial * 15 / 100; 
            } else { 
                aux = salInicial * 5 / 100; 
            } 
            salfinal = salInicial + aux; 
            System.out.println(codigo + " " + horat + " " + vlr + " " + salInicial + " " + aux + " " + salfinal); 
        } 
    } 
} 
