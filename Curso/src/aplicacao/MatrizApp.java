package aplicacao;

import java.util.Scanner;

public class MatrizApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de linha: ");
		int l = sc.nextInt();
		System.out.print("Entre com o número de coluna: ");
		int c = sc.nextInt();
		
		int[][] matriz = new int [l][c];
		
		for(int i=0; i<matriz.length; i++){
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.print("Digite um número para pesquisar na matriz: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == n) {
					System.out.println("Posição: "+ i+" ,"+j);
					
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
				
				
			}
		}
		
		
		
//		for(int i=0; i<matriz.length; i++){
//			for (int j = 0; j < matriz.length; j++) {
//				System.out.print(" "+matriz[i][j]);		
//			}
//			
//			System.out.println();
//		}

	}

}
