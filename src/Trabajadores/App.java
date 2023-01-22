package Trabajadores;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		

		TreballadorOnline online = new TreballadorOnline ("Pedro", "Perez", 18);
		
		
		System.out.println(online.getNombre()+" trabaja online y su sueldo es de "+online.calcularSueldo(46));
		
		TreballadorPresencial presencial = new TreballadorPresencial("Juan","Garcia", 16);
		
		System.out.println(presencial.getNombre()+" trabaja presencial y su sueldo es de "+presencial.calcularSueldo(46));

		
		presencial.calcularSueldoSingasolina(35);
		
		online.calcularSueldoConBono(25, 250);
		
	}

}
