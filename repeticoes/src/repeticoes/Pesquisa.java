package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, esporte;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito ");
			System.out.println("Digite a sua idade: ");
			idade = input.nextInt();
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			
			System.out.println("Digite o seu esporte favorito:");
			esporte = input.nextInt();
			System.out.println("Deseja continuar (S/N)? ");
			input.skip("\\R");
			continua = input.nextLine().toUpperCase();
		}
		
		
		input.close();
		

	}

}
