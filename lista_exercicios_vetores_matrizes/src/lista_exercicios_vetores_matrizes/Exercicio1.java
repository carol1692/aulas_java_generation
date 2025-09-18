package lista_exercicios_vetores_matrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroProcurado;
		
		int numeros[] = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = input.nextInt();
		
		for(int contador=0; contador < numeros.length; contador++) {
			if(numeros[contador] == numeroProcurado) {
				System.out.println("O número "+ numeroProcurado + " está localizado na posição: " + contador);
				break;
			}else if(contador == (numeros.length)-1) {
				System.out.println("O número "+ numeroProcurado + " não foi encontrado ");
			}
			
			
		}
		
		input.close();

	}

}
