class Puerta{
	//ATRIBUTOS
	private boolean estado;
	private Ventana ventanaPuerta;

	//CONSTRUCTOR
	public Puerta(){
		estado = false;
		ventanaPuerta = new Ventana();
	}

	//GET
	public boolean getEstado(){
		return estado;
	}

	public Ventana getVentanaPuerta(){
		return ventanaPuerta;
	}

	//METODOS PUERTA
	public void abrir(){
		estado = true;
	}

	public void cerrar(){
		estado = false;
	}

	public String toString(){
		String resultadoP = "Puerta: Cerrada";
		if (estado == true){
			resultadoP = "Puerta: Abierta";
		}
		return resultadoP + " | " + ventanaPuerta;
	}

}