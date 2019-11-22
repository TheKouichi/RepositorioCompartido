package interfaz;

public class TestGeometria {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(4, 2);
		Geometria interfaz = rectangulo;
		System.out.println("El area del rectangulo es: " + interfaz.area());
		System.out.println("El perimetro del rectangulo es: " + interfaz.perimetro());
		
		interfaz = new Circulo(2);
		System.out.println("El area del circulo es: " + interfaz.area());
		System.out.println("El perimetro del circulo es: " + interfaz.perimetro());

	}

}
