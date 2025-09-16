package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		Scanner input = new Scanner(System.in);
				
		
		
		System.out.println("Digite o Nome do doador: ");
		nome = input.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = input.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		input.skip("\\R");
		primeiraDoacao = input.nextBoolean();
		
		if(idade > 18 && idade < 69) {
						
			if( idade >= 60 && idade <= 69 && primeiraDoacao == true) {
				System.out.printf("%s está apta para doar sangue! ", nome);
			}else {
				System.out.printf("%s não está apta para doar sangue! ", nome);
			}
			
		}else {
			System.out.printf("%s não está apta para doar sangue! ", nome);
		}
		
		input.close();

	}

}
