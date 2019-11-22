package clases;

public class TestCuentaC {
	
	public static void main(String [] args) {
	System.out.println("Cuenta de ahorro:");
	CuentaAhorro cuenta1 = new CuentaAhorro("Elia", "665665", 100, 0.01, 10);
	System.out.println(cuenta1.mostrarDatos());
	System.out.println("\nCuenta corriente:");
	CuentaCorriente cuentaElia = new CuentaCorriente("elia", "522", 100, 0.002, 3, 5);
	System.out.println(cuentaElia.mostrarDatos());
	System.out.println();
	CuentaCorrienteConIn cliente01 = new CuentaCorrienteConIn("Angel Lillo", "111/6666", 10000, 3.5, 30, 5);
	System.out.println(cliente01.getNombreTitular());
	System.out.println(cliente01.getNumCuenta());
	System.out.println(cliente01.getSaldo());
	System.out.println(cliente01.getTipoDeInteres());
	System.out.println(cliente01.mostrarDatos());
	
	}
}