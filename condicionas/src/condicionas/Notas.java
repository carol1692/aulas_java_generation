package condicionas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
        
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = input.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Media do aluno é: " + media );
		if(media >= 7 ) {
			System.out.println("Aluno foi aprovado!");
		}else if( media >= 5 && media < 7) {
			System.out.println("Aluno em recuperação!");
		}else {
			System.out.println("Aluno foi reprovado!");
		}
		input.close();
	}

}
