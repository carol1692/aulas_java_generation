package loops_lista_exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, contador21=0, contador50=0;
		
		System.out.println("Digite uma idade:");
		idade = input.nextInt();
		
		while(idade > 0){
			if(idade < 21) {
				contador21++;
			}else if(idade >= 50) {
				contador50++;
			}
			System.out.println("Digite uma idade:");
			idade = input.nextInt();
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+ contador21);
		System.out.println("Total de pessoas maiores de 50 anos: "+ contador50);
		
		input.close();
	}

}
