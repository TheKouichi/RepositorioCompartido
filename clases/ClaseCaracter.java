package clases;

import java.io.IOException;

public class ClaseCaracter {

	public static void main(String[] args) throws IOException {
		char car = 'Z';
		Character caracter = new Character ('A');
		System.out.println("El caracter es: " + caracter);
		System.out.println("Introduce un caracter: ");
		char c = (char) System.in.read();
		if(Character.isDigit(c))
			System.out.println("Esto es un numero");
		else if(Character.isLetter(c)) {
			if(Character.isLowerCase(c)) {
				System.out.println("La letra introducida es minuscula, transformando a mayuscula");
				System.out.println("El caracter es: " + Character.toUpperCase(c));
			}
			else {
				System.out.println("La letra introducida es maysucula, transformando a minuscula");
				System.out.println("El caracter es: " + Character.toLowerCase(c));
			}
				
		}
			
			
	}

}
