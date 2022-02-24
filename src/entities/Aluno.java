package entities;

public class Aluno {
	
	public String name;
	public double a,  b, c, media, d;
	
	public void nota() {
		media = a + b + c;
	}
	
	public void status() {
		if(media >= 60) {
			System.out.printf("FINAL GRADE = %.2f\n", media);
			System.out.println("PASS");
		}
		else {
			System.out.printf("FINAL GRADE = %.2f\n", media);
			System.out.println("FAILED");
			d = 60 - media;
			System.out.printf("MISSING %.2f POINTS", d );
		}
	}
	
}

/*

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.name = sc.nextLine();
		aluno.a = sc.nextDouble();
		aluno.b = sc.nextDouble();
		aluno.c = sc.nextDouble();
		
		aluno.nota();
		aluno.status();
				
		sc.close();
	}
}

 */

