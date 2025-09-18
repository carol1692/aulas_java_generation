package lista_exercicios_vetores_matrizes;

public class Exercicio3 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		
		int matriz[][] = {{1, 2, 3},{4,5,6},{7,8,9}};
		int diagonalPrincipal[] = new int[3];
		int diagonalSecundaria[] = new int[3];
		int somaPrincipal=0, somaSecundaria=0;
		
		for(int linha=0; linha < matriz.length; linha++ ) {
			for(int coluna=0; coluna < matriz.length; coluna++) {
				if(linha==coluna) {
					diagonalPrincipal[linha] = matriz[linha][coluna];
					somaPrincipal += matriz[linha][coluna];
				}
				
			}
			
		}

		
		for(int linha = matriz.length-1; linha >= 0; linha--) {
			for(int coluna=0; coluna < matriz.length; coluna++ ) {
				if (linha + coluna == matriz.length - 1) {
					diagonalSecundaria[linha] = matriz[linha][coluna];
					somaSecundaria += matriz[linha][coluna];
				}
			}
		}
		
		System.out.printf("%d %d %d \n",diagonalPrincipal[0],diagonalPrincipal[1],diagonalPrincipal[2]);
		System.out.printf("%d %d %d \n",diagonalSecundaria[0],diagonalSecundaria[1],diagonalSecundaria[2]);	
		System.out.printf("%d \n",somaPrincipal);	
		System.out.printf("%d \n",somaSecundaria);	
	}
		
 
}


