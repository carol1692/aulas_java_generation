package entrada_saida_lista_exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a primeira nota do aluno:");
		nota1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno:");
		nota2 = input.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno:");
		nota3 = input.nextFloat();
		
		System.out.println("Digite a quarta nota do aluno:");
		nota4 = input.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
				
		System.out.printf("Média final: %.1f", mediaFinal);
		
		input.close();
	}

}
