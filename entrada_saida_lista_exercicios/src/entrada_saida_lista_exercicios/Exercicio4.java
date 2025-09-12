package entrada_saida_lista_exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite nota 1:");
		n1 = input.nextFloat();
		
		System.out.println("Digite nota 2:");
		n2 = input.nextFloat();
		
		System.out.println("Digite nota 3 :");
		n3 = input.nextFloat();
		
		System.out.println("Digite nota 4:");
		n4 = input.nextFloat();
		
		System.out.printf("A diferença do produto entre %.1f e %.1f pelo produto entre %.1f e %.1f é: %.1f ", n1, n2, n3, n4, (n1*n2) - (n3*n4) );
		
		
		input.close();

	}

}
