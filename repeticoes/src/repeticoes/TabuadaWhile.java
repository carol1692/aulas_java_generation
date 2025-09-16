package repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero, contador=1;
		
		System.out.println("Digite um número:");
		numero = input.nextInt();
		
		while(contador<=10) {
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
			contador ++;
		}
		
		
		input.close();
	}

}
