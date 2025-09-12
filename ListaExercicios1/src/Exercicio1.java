import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite seu salário atual:");
		salario = input.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = input.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário será: %.2f", novoSalario);
		
		input.close();

	}

}
