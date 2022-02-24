package entities;

public class Funcionario {

	public String name;
	public double grossSalary,  tax, percent;
	
	public void salary() {
		grossSalary -= tax;
	}
	
	public void percentage() {
		grossSalary += tax;
		grossSalary += grossSalary * (percent / 100);
		grossSalary -= tax;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", grossSalary);
	}
}


/*

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		System.out.println("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		funcionario.salary();
		
		System.out.println();
		System.out.println("Product data: " + funcionario);
		
		System.out.println("White precentage to incrase salary: ");
		funcionario.percent = sc.nextDouble();
		funcionario.percentage();
		
		System.out.println();
		System.out.println("Product data: " + funcionario);
		
		sc.close();
	}
}

*/