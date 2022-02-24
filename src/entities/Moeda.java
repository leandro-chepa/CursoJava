package entities;

public class Moeda {
	
	public class CurrencyConverter {
		public static double IOF = 0.06;
		public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
		}
	}
}

/*

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Moeda.CurrencyConverter;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		sc.close();
		}
		
}


*/