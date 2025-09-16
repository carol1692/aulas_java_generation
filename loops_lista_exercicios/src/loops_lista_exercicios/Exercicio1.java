package loops_lista_exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite um numero:" );
		numero1 = input.nextInt();
		
		System.out.println("Digite um numero:" );
		numero2 = input.nextInt();
		
		if (numero1 < numero2) {
			for(int contador = numero1; contador <= numero2; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", contador );
				}
			}
		}else {
			System.out.println("Intervalo é inválido");
		}
		
		
		input.close();
	}

}
