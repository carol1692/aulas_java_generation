package condicionais_lista_exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String esqueleto, classeAnimal, alimentacao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite vertebrado ou invertebrado:" );
		esqueleto = input.nextLine();
		classeAnimal = input.nextLine();
		alimentacao = input.nextLine();
		switch(esqueleto) {
			case "vertebrado":
				switch(classeAnimal) {
					case "ave":
						if(alimentacao.equals("carnivoro")) {
							System.out.println("Águia");
						}else if(alimentacao.equals("onivoro")){
							System.out.println("Pomba");
						}
						break;
					case "mamifero":
						if(alimentacao.equals("onivoro")) {
							System.out.println("Homem");
						}else if(alimentacao.equals("herbivoro")){
							System.out.println("Vaca");
						}
						break;
				}
			case "invertebrado":
				switch(classeAnimal) {
				case "inseto":
					if(alimentacao.equals("hematofago")) {
						System.out.println("Pulga");
					}else if(alimentacao.equals("herbivoro")){
						System.out.println("Lagarto");
					}
					break;
				case "anelideo":
					if(alimentacao.equals("hematofago")) {
						System.out.println("Sanguesuga");
					}else if(alimentacao.equals("onivoro")){
						System.out.println("Minhoca");
					}
					break;
			}
		}
		
		
		
		input.close();
		
	}

}
