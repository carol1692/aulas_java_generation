package lista_exercicio_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número:");
			setNumeros.add(input.nextInt());
		}
		
		Iterator<Integer> itNumeros = setNumeros.iterator();
		
		System.out.println("\nListar dados do Set: \n");
		while(itNumeros.hasNext()) {
			
			System.out.println(itNumeros.next());
		}
		
		input.close();

	}

}
