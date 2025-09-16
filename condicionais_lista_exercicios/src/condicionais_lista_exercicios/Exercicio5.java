package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigo, quantidade; 
		
		System.out.println("Código Produto: ");
		codigo = input.nextInt();
	System.out.println("Quantidade: ");
		quantidade = input.nextInt();	
		
		switch(codigo) {
			case 1: 
				System.out.println("Produto: Cachorro Quente");
				System.out.printf("Valor total: R$%d,00", quantidade * 10 );
				break;
			case 2:
				System.out.println("Produto: X-Salada");
				System.out.printf("Valor total: R$%d,00", quantidade * 15 );
				break;
			case 3:
				System.out.println("Produto: X-Bacon");
				System.out.printf("Valor total: R$%d,00", quantidade * 18 );
				break;
			case 4:
				System.out.println("Produto: Bauru");
				System.out.printf("Valor total: R$%d,00", quantidade * 12 );
				break;
			case 5:
				System.out.println("Produto: Refrigerante");
				System.out.printf("Valor total: R$%d,00", quantidade * 8 );
				break;
			case 6:
				System.out.println("Produto: Suco de laranja");
				System.out.printf("Valor total: R$%d,00", quantidade * 13 );
				break;
			default:
				System.out.printf("Valor inválido");
				break;
			
		}
		
		input.close();
		

	}

}
