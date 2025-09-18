package loops_lista_exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, contaPar=0, contaImpar=0;
		
		for(int contador=0; contador < 10; contador++) {
			System.out.println("Digite um número:");
			numero = input.nextInt();
			if(numero % 2 == 0) {
				contaPar++;
			}else {
				contaImpar++;
			}
		}
		
		System.out.println("Total de números pares: "+ contaPar);
		System.out.println("Total de números ímpares: " + contaImpar);
		input.close();

	}

}
