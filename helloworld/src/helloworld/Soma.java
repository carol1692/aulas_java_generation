package helloworld;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numero1, numero2;
		
		System.out.println("Digite número 1: ");
		numero1 = input.nextDouble();
		
		System.out.println("Digite número 2: ");
		numero2 = input.nextDouble();
		
		System.out.printf("A soma do número %.2f + %.2f é %.2f", numero1, numero2, numero1+numero2);
		
		input.close();
		
		
	}

}
