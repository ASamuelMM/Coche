public class Main {
	public static void main(String[] args) {

		Motor ferrari = new Motor();
		Ventana miVentana = new Ventana();
		Puerta miPuerta = new Puerta();
		Coche miCoche = new Coche();
		Ventana ventanaDerCoxe = new Ventana();


		System.out.println(miCoche);
		System.out.println("--------------------------------------------------------");
		miCoche.abrirPuerta(1);
		miCoche.abrirVentanaDePuerta(2);
		System.out.println(miCoche);



		/*
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
		*/

		/*
		System.out.println("----MOTOR ENCENDIDO, PUERTA CERRADA, VENTANA ABIERTA----");
		ferrari.encender();
		miPuerta.getVentanaPuerta().abrir();
		System.out.println(ferrari);
		System.out.println(miPuerta);

		System.out.println("----PUERTA ABIERTA CON VENTANA CERRADA----");
		miPuerta.abrir();
		miPuerta.getVentanaPuerta().cerrar();
		System.out.println(miPuerta);
		*/

		/*
		//VER COMO ESTA EL MOTOR
		System.out.println(miCoche.getMotor());

		//VER COMO ESTA LA PUERTA DERECHA
		System.out.println(miCoche.getPuertaDer());
		System.out.println("ABRE LA PUERTA DERECHA");
		miCoche.getPuertaDer().abrir();
		System.out.println(miCoche);

		//VER COMO ESTA LA VENTANA DE LA PUERTA DERECHA
		System.out.println("VENTANA DE LA PUERTA DERECHA");
		miCoche.getPuertaDer().getVentanaPuerta();
		System.out.println(miCoche.getPuertaDer().getVentanaPuerta());
		//System.out.println("ABRIR LA VENTANA DE LA PUERTA DERECHA");
		//miCoche.getPuertaDer().getVentanaPuerta().abrir();
		//System.out.println(miCoche.getPuertaDer().getVentanaPuerta());


		//QUEREMOS TRABAJAR CON LA PUERTA DERECHA
		ventanaDerCoxe = miCoche.getPuertaDer().getVentanaPuerta();
		ventanaDerCoxe.cerrar();
		System.out.println(ventanaDerCoxe);

		System.out.println("ABRIR LA VENTANA DE LA PUERTA DERECHA");
		miCoche.abrirVentanaDer();
		System.out.println(miCoche);
		*/

	}

}
