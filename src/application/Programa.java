 package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
				
		int x = sc.nextInt();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Possition " + i + ","+ j);
					
					// if para achar acima
					if(i > 0) {
						int a = i - 1;
						System.out.println("Acima " + mat[a][j]);
					} 
					// if para achar esquerda
					if(j > 0) {
						int a = j - 1;
						System.out.println("Esquerda " + mat[i][a]);
					} 
					// if para achar abaixo
					if(i < mat.length) {
						int a = i + 1;
						System.out.println("Baixo " + mat[a][j]);
					} 
					// if para achar Direita
					if(j < mat[i].length) {
						int a = j + 1;
						System.out.println("Direita " + mat[i][a]);
					}
				}
			}
		}
		
		sc.close();
	}
}
