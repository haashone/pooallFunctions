package models;

public class Calcul {
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	private double a;
	private double b;
	
	
	public double somme(int a, int b) {
		return a+b;
	}
	
	public double multi(int a, int b) {
		return a*b;
	}


}
