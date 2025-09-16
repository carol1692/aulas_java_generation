package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String colaborador;
		int codigoColaborador;
		float salarioColaborador;
		
		System.out.println("Nome do colaborador: ");
		colaborador = input.nextLine();
		System.out.println("Cargo: ");
		codigoColaborador = input.nextInt();
		System.out.println("Salário: ");
		salarioColaborador = input.nextFloat();
		
		switch(codigoColaborador) {
			case 1:
				System.out.println("Nome do colaborador: " + colaborador);
				System.out.println("Gerente");
				System.out.printf("%.2f", (salarioColaborador*0.10)+salarioColaborador);
				break;
			case 2:
				System.out.println("Nome do colaborador: " + colaborador);
				System.out.println("Vendedor");
				System.out.printf("%.2f", (salarioColaborador*0.07)+salarioColaborador);
				break;
			case 3:
				System.out.println("Nome do colaborador: " + colaborador);
				System.out.println("Supervisor");
				System.out.printf("%.2f", (salarioColaborador*0.09)+salarioColaborador);
				break;
			case 4:
				System.out.println("Nome do colaborador: " + colaborador);
				System.out.println("Motorista");
				System.out.printf("%.2f", (salarioColaborador*0.06)+salarioColaborador);
				break;
			case 5:
				System.out.println("Nome do colaborador: " + colaborador);
				System.out.println("Estoquista");
				System.out.printf("%.2f", (salarioColaborador*0.05)+salarioColaborador);
				break;
			case 6:
				System.out.println("Nome do colaborador: " + colaborador);
				System.out.println("Técnico de TI");
				System.out.printf("%.2f", (salarioColaborador*0.08)+salarioColaborador);
				break;
		}
		
		input.close();

	}

}
