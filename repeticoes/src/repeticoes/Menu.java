package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
//		DO WHILE
		do {
			System.out.println("Digite a opção desejada: ");
			opcao = input.nextInt();
		}while(opcao == 0 );
		
//		WHILE
		while(opcao == 0) {
			System.out.println("Digite a opção desejada: ");
			opcao = input.nextInt();
			
		}
		
		input.close();
		

	}

}
