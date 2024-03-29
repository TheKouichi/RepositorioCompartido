package interfaz;

import java.util.Scanner;

public class Rectangulo implements Geometria
{
	private double base;
	private double altura;
	private Scanner entrada;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public Rectangulo() {
		entrada = new Scanner (System.in);
		System.out.println("Introduce la base: ");
		base = entrada.nextDouble();
		System.out.println("Introduce la altura: ");
		altura = entrada.nextDouble();
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public double getBase() {
		return base;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public void setBase(double base) {
		this.base = base;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public double getAltura() {
		return altura;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public void setAltura(double altura) {
		this.altura = altura;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public double area() {
		return base * altura;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public double perimetro() {
		return 2*(base + altura);
	}
}
