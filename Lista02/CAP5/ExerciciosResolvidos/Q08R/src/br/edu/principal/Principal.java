package br.edu.principal; 

public class Principal { 

    public static void main(String[] args) { 

        int ntermos = 10; 
        int num2 = 1; 
        int num3 = 1; 
        int i = 1; 
        while (i <= ntermos) { 
            num2 *= 3; 
            System.out.println(num2); 
            i++; 
            if (i <= ntermos) { 
                num3 *= 4; 
                System.out.println(num3); 
                i++; 
            } 
        } 
    } 

} 
