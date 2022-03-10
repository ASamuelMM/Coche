public class Main {
	public static void main(String[] args) {

		Motor ferrari = new Motor();
		Ventana miVentana = new Ventana();
		Puerta miPuerta = new Puerta();

		//MOTOR
		System.out.println("MOTOR AL PRINCIPIO");
		System.out.println(ferrari.getEncendido());
		ferrari.encender();
		System.out.println("MOTOR ENCENDIDO");
		System.out.println(ferrari.getEncendido());

		//VENTANA
		System.out.println("VENTANA AL PRINCIPIO");
		System.out.println(miVentana.getAbierta());
		miVentana.abrir();
		System.out.println("VENTANA ABIERTA");
		System.out.println(miVentana.getAbierta());

		//PUERTA
		System.out.println("PUERTA AL PRINCIPIO");
		System.out.println(miPuerta.getEstado());
		miPuerta.abrir();
		System.out.println("PUERTA ABIERTA");
		System.out.println(miPuerta.getEstado());
		System.out.println("VENTANA DE LA PUERTA");
		miPuerta.getVentanaPuerta().abrir();
		System.out.println(miPuerta.getVentanaPuerta().getAbierta());

		//LLAMADA DE TO STRING
		System.out.println("TO STRINGS");
		System.out.println(ferrari);
		System.out.println(miVentana);
		System.out.println(miPuerta);

		
	}
	
}