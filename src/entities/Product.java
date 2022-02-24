package entities;

public class Product {

	public String name;
	public double prince;
	public int quantity;
	
	public Product() {
	}
	
	public Product(String name, double prince, int quantity) {
		this.name = name;
		this.prince = prince;
		this.quantity = quantity;
	}
	
	public Product(String name, double prince) {
		this.name = name;
		this.prince = prince;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrince() {
		return prince;
	}

	public void setPrince(double prince) {
		this.prince = prince;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return prince * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", prince)
				+", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock())
				;
	}
}

/*

CODIGO FONTE


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name ");
		product.name = sc.nextLine();
		System.out.print("Prince ");
		product.prince = sc.nextDouble();
		System.out.print("Quantity in stock ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Entre the number of products be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Entre the number of products be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		sc.close();
	}
}




 */





