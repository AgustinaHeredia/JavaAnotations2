package Trabajadores;

public class TreballadorOnline extends Treballador{

	static final double INTERNET = 50;
	
	public TreballadorOnline(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
		
	}
	@Override
	public double calcularSueldo(double horasTrabajadas) {
		return super.calcularSueldo(horasTrabajadas)+INTERNET;
	}
	
	@Deprecated
	public double calcularSueldoConBono(double horasTrabajadas,double bono) {
        return (precioHora * horasTrabajadas)+bono;
    }
	
}
