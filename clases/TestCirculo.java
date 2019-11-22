package clases;

public class TestCirculo {

	public static void main(String[] args) {
		Circulo miCirculo = new Circulo ();
		System.out.println("CIRCULO 1");
		System.out.println("El radio del circulo 1 es: " + miCirculo.getRadio());
		System.out.println("La superficie del circulo 1 es: " + miCirculo.calcularSuperficie());
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
		
		Circulo tuCirculo = new Circulo(miCirculo);
		tuCirculo.setRadio(10);
		System.out.println("CIRCULO 2");
		System.out.println("El radio del circulo 2 es: " + tuCirculo.getRadio());
		System.out.println("La superficie del circulo 2 es: " + tuCirculo.calcularSuperficie());
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
		
		Circulo suCirculo = new Circulo(miCirculo);
		suCirculo.setRadioDet(2);
		System.out.println("CIRCULO 3");
		System.out.println("El radio del circulo 3 es: " + suCirculo.getRadioDet());
		System.out.println("La superficie del circulo 3 es: " + suCirculo.calcularSuperficieDet());
		
	}

}
