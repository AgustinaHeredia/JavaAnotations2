package Trabajadores;

public class Treballador {

	protected String nombre;
	protected String apellido;
	protected double precioHora;
	
	public Treballador ( String nombre, String apellido, double precioHora) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.precioHora = precioHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
	
	public double calcularSueldo(double horasTrabajadas) {
		double sueldo = precioHora * horasTrabajadas;
		return sueldo;
	}
	
}
