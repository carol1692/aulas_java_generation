package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float numero1,numero2;
		
		int codigoOp;
		
		System.out.println("Digite o 1º número:");
		numero1 = input.nextFloat();
		System.out.println("Digite o 2º número:");
		numero2 = input.nextFloat();
		System.out.println("Operação:");
		codigoOp = input.nextInt();
		
		switch(codigoOp) {
			case 1:
				System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, numero1 + numero2 );
				break;
			case 2:
				System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, numero1 - numero2 );
				break;
			case 3:
				System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, numero1 * numero2 );
				break;
			case 4:
				System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, numero1 / numero2 );
				break;
			default:
				System.out.println("Operação Inválida!");
				break;
		}
		
		input.close();
		

	}

}
