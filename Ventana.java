class Ventana{
	//ATRIBUTOS
	private boolean abierta;

	//CONSTRUCTOR POR DEFECTO
	public Ventana(){
		abierta = false;
	}

	//GET
	public boolean getAbierta(){
		return abierta;
	}

	//SET
	//private void setEstado(boolean etd){
	//	estado = etd;
	//}

	//METODOS
	public void abrir(){
		abierta = true;
		//setEstado(true);
	}

	public void cerrar(){
		abierta = false;
		//setEstado(false);
	}

	public String toString(){
		String resultadoV = "VENTANA: Cerrada";
		if (abierta){
			resultadoV = "VENTANA: Abierta";
		}
		return resultadoV;
	}
}
