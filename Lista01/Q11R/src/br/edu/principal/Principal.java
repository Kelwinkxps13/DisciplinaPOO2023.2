package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner numl = new Scanner(System.in);
  		
  		System.out.print("Escreva um numero positivo e maior que zero: ");
  		double num = numl.nextDouble();

  		double quad = num*num;
  		double cubic = num*num*num;
  		double sqrt = (Math.sqrt(num));
  		double cbrt = (Math.cbrt(num));

  		System.out.println("Valor do numero ao quadrado: " + quad);
  		System.out.println("Valor do numero ao cubo: " + cubic);
  		System.out.println("Valor da raiz quadrada: " + sqrt);
  		System.out.println("Valor da raiz cubica: " + cbrt);
	}

}
