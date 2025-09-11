package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o peso:");
		int peso = leia.nextInt();
		
		System.out.println("digite uma opção:");
		char opcao = leia.next().charAt(0);
		
		System.out.println("digite o valor:");
		float valor = leia.nextFloat();
		
		System.out.println("O valor da variavel peso é: " + peso);
		System.out.println("O valor da variavel opção é: " + opcao);
		System.out.println("O valor da variavel valor é: " + valor);
		
		System.out.printf("O valor da variavel valor é: %.2f \n ", valor);
		
		leia.close();
	}

}
