package com.dailychallenge;

public class Dailychallenge {
	
	//Attribut
	
	private double num1;
	private double num2;
	
	//Controller sans parametre
	
	public Dailychallenge() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Controller avec parametre
	
	public Dailychallenge(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	//Getters et Setters
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	//Methodes
	
	public double add() {
		return this.num1 + this.num2;
		
	}
	
	public double subtract() {
		return this.num1 - this.num2;
	}
	
	public double multiply() {
		return this.num1 * this.num2;
	}
	
	public double divide() {
		return this.num1 / this.num2;
	}
	
	//Main
	
	public static void main(String[] args) {
		
		Dailychallenge resultat = new Dailychallenge(5, 10);
		
		System.out.println(resultat.add());
		System.out.println(resultat.subtract());
		System.out.println(resultat.multiply());
		System.out.println(resultat.divide());

	}

	
	

}
