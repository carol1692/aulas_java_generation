package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Definir as variáveis 
		
		double numero1, numero2;
		
		// Instanciar objeto da classe scanner
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		// Efetuar os cálculos
		System.out.printf("%.2f + %.2f é %.2f%n",numero1, numero2,numero1+numero2);
		System.out.printf("%.2f - %.2f é %.2f%n",numero1, numero2,numero1-numero2);
		System.out.printf("%.2f * %.2f é %.2f%n",numero1, numero2,numero1*numero2);
		System.out.printf("%.2f / %.2f é %.2f%n",numero1, numero2,numero1/numero2);
		
		// Operações matemáticas com  a biblioteca Math
		System.out.printf("%.2f ^ %.2f é %.2f%n",numero1, numero2,Math.pow(numero1, numero2));
		System.out.printf("Raiz quadrada de %.2f = %.2f%n",numero1,Math.sqrt(numero1));
	}

}
