package entrada_saida_lista_exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = input.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		addNoturno = input.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = input.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = input.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf(" O valor do salário final será: R$%.2f ", salarioLiquido);
		
		input.close();

	}

}
