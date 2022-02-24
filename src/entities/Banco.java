package entities;

public class Banco {
	
	private int conta;
	private String name;
	private double saldo;
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void removeSaldo(double saldo) {
		this.saldo -= saldo + 5.00;
	}
	
	public Banco() {
	}
	
	public Banco(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}
	
	public Banco(int conta, String name, double saldo) {
		this.conta = conta;
		this.name = name;
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Account"
				+ conta
				+", Holder: "
				+ name
				+ ", Balance: "
				+ String.format("%.2f", saldo)
				;
	}
}


/*
 
 package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco banco = new Banco();
		
		System.out.println("Digite a conta ");
		System.out.print("Conta: ");
		int conta = sc.nextInt();
		System.out.println("Digite o nome ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Deseja fazer o depoisito inicial? (S/N)");
		String x = sc.next();
		
		if (x.equals("s")) {
			
			System.out.println("Valor do deposito ");
			System.out.print("Valor: ");
			double saldo = sc.nextDouble();
			banco = new Banco(conta, name, saldo);
		}
		else {
			banco = new Banco(conta, name);
		}
		
		System.out.println();
		System.out.println("Product data: " + banco);
		
		System.out.println();
		System.out.print("Valor do deposito ");
		double saldo = sc.nextDouble();
		banco.addSaldo(saldo);;
		
		System.out.println();
		System.out.println("Product data: " + banco);
		
		System.out.println();
		System.out.print("Qual o valor do saque ");
		saldo = sc.nextDouble();
		banco.removeSaldo(saldo);
		
		System.out.println();
		System.out.println("Product data: " + banco);
		
		sc.close();
	}
}

*/
