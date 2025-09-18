package lista_exercicio_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>(); 
		
		for(int contador = 0 ; contador < 5; contador++) {
			System.out.println("Digite uma cor:");
			cores.add(input.nextLine());
		}
					
		System.out.println("Listar todas as cores:\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		
		Collections.reverse(cores);
		System.out.println("\nOrdenar as cores:\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		
		input.close();
		

	}

}
