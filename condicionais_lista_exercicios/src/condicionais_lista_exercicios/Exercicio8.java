package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codOperacao;
		
		float saldo = 1000, valor;
		
		codOperacao = input.nextInt();
		
		switch(codOperacao) {
			case 1:
				System.out.println("Operação - Saldo");
				System.out.printf("Saldo: R$%.2f", saldo);
				break;
			case 2:
				System.out.println("Operação - Saque");
				System.out.println("Valor: ");
				valor = input.nextFloat();
				saldo -= valor;
				if(saldo <= 0) {
					System.out.printf("Saldo Insuficiente!");
				}else {
					System.out.printf("Saldo: R$%.2f", saldo);
				}
				
				break;
			case 3:
				System.out.println("Operação - Depósito");
				valor = input.nextFloat();
				saldo += valor;
				System.out.printf("Saldo: R$%.2f", saldo);
				break;
			default:
				System.out.println("Operação Inválida!");
		}
		
		input.close();
	}

}
