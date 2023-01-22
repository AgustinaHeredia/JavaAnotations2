package Trabajadores;

public class TreballadorPresencial extends Treballador{

	static double gasolina= 185;
	
	public TreballadorPresencial(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		
	}

	
	@Override
	public double calcularSueldo(double horasTrabajadas) {
		return super.calcularSueldo(horasTrabajadas)+gasolina;
	}
	
	@Deprecated
	public double calcularSueldoSingasolina(double horasTrabajadas) {
		return super.calcularSueldo(horasTrabajadas);
	}
	
}
