package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		String nome[]= {"Chata 1", "Chata 2","Chata 3", "Chata 4"};
		
		int matriz[][] = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[linha].length; coluna++) {
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = input.nextInt();
				
				System.out.println(matriz[linha][coluna]);
			}
			
		}
		
		input.close();
		
		System.out.println(nome[0]);

	}

}
