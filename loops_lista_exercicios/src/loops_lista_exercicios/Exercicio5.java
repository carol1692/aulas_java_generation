package loops_lista_exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int numero, contador = 0;
		
		do{
			System.out.println("Digite um número");
			numero = input.nextInt();
			if(numero > 0) {
				contador += numero; 
			}
			
			
			
		}while(numero != 0);
		System.out.println("A soma dos números positivos é: "+ contador );
		input.close();
	}

}
