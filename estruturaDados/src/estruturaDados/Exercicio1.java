package estruturaDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		
		int opcao;
		String cliente;
		
		do {
			System.out.println("\n");
			System.out.println("************************************");
			System.out.println("   1 - Adicionar Cliente na Fila    ");
			System.out.println("   2 - Listar todos os Cliente      ");
			System.out.println("   3 - Retirar Cliente da Fila      ");
			System.out.println("   0 - Sair                         ");
			System.out.println("************************************");
			System.out.println("Entre com a opção desejada:         ");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1:
					input.skip("\\R");
					System.out.println("Digite nome do cliente: ");
					cliente = input.nextLine();
					fila.add(cliente);
					System.out.println("Fila\n");
					
					Iterator<String> iterator = fila.iterator();
					while(iterator.hasNext()){
						   System.out.println(iterator.next());
					}
					System.out.println("\nCliente Adicionado!");
					break;
				case 2:
					input.skip("\\R");
					Iterator<String> iterator2 = fila.iterator();
					while(iterator2.hasNext()){
					   System.out.println(iterator2.next());
					}
					break;
				case 3:
					input.skip("\\R");
					if(fila.isEmpty()) {
						System.out.println("A Fila está vazia!");
					}else {
						fila.poll();
						System.out.println("Fila\n");
						Iterator<String> iterator3 = fila.iterator();
						while(iterator3.hasNext()){
						   System.out.println(iterator3.next());
						}
					}
					break;
				case 0:
					System.out.println("Programa Finalizado!");
					break;
			}
			
			
			
		} while(opcao != 0);
		
		
		
		
		
		
		
		
		
	}

}
