package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A,B,C,soma;
		System.out.println("Digite o valor de A: ");
		A = input.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = input.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = input.nextInt();
		
		
		soma = A + B;
		
		if(soma > C) {
			System.out.printf("%d + %d = %d > %d \n", A, B,A+B,C);
			System.out.printf("A Soma de A + B é maior do que C \n", A, B,A+B,C);
		}else if(soma == C) {
			System.out.printf("%d + %d = %d = %d \n", A, B,A+B,C);
			System.out.printf("A Soma de A + B é igual C \n", A, B,A+B,C);
		}else {
			System.out.printf("%d + %d = %d < %d \n", A, B,A+B,C);
			System.out.printf("A Soma de A + B é menor do que C \n", A, B,A+B,C);
		}
		
		
		
		input.close();
			

	}

}
