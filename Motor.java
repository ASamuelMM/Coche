class Motor{
	//ATRIBUTOS
	private boolean encendido;

	//CONSTRUCTOR POR DEFECTO
	public Motor(){
		encendido = false;
	}

	//GET
	public boolean getEncendido(){
		return encendido;
	}

	//METODOS
	public void encender(){
		encendido = true;
	}

	public void apagar(){
		encendido = false;
	}

	public String toString(){
		String resultadoM = "MOTOR: Apagado";
		if (encendido == true){
			resultadoM = "MOTOR: Encendido";
		}
		return resultadoM;
	}

}
