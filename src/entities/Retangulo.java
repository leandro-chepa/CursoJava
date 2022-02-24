package entities;

public class Retangulo {

	public double a;
	public double b;
	
	public double area(){
		return a * b;	
	}
	
	public double Perimeter(){
		return a * 2 + b * 2;	
	}
	
	public double Diagonal(){
		return Math.sqrt(Math.pow(a, 2) +  Math.pow(b, 2));	
	}
	
	
}

/*
 
 package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x =  new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Area = %.2f", x.area());
		
		System.out.println();
		System.out.printf("Perimentro = %.2f", x.Perimeter());
		
		System.out.println();
		System.out.printf("Diagonal = %.2f", x.Diagonal());
		
		sc.close();
	}
}



 
 */



