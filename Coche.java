class Coche{
	//ATRIBUTOS
	private Motor motorCoche;
	private Puerta puertaDelIzq;
	private Puerta puertaDelDer;
	private Puerta puertaTraIzq;
	private Puerta puertaTraDer;

	//CONSTRUCTOR
	public Coche(){
		this.motorCoche = new Motor();
    this.puertaDelIzq = new Puerta();
    this.puertaDelDer = new Puerta();
		this.puertaTraIzq = new Puerta();
		this.puertaTraDer = new Puerta();
	}

  //GET
  public Puerta getPuertaDelIzq(){
    return this.puertaDelIzq;
  }

  public Puerta getPuertaDelDer(){
    return this.puertaDelDer;
  }

	public Puerta getPuertaTraIzq(){
		return this.puertaTraIzq;
	}

	public Puerta getpuertaTraDer(){
		return this.puertaTraDer;
	}

  public Motor getMotor(){
    return this.motorCoche;
  }

	//FUNCION ABRIR PUERTA POR NUMERO
	public void abrirPuerta(int numero){
		if (numero == 1){
			this.puertaDelIzq.abrir();
		}else if (numero == 2) {
			this.puertaDelDer.abrir();
		}else if (numero == 3) {
			this.puertaTraIzq.abrir();
		}else if (numero == 4){
			this.puertaTraDer.abrir();
		}
	}

	//FUNCION ABRIR VENTANAS DE LAS PUERTAS CON NUMERO
	public void abrirVentanaDePuerta(int numero){
		if (numero == 1){
			this.puertaDelIzq.getVentanaPuerta().abrir();
		}else if (numero == 2) {
			this.puertaDelDer.getVentanaPuerta().abrir();
		}else if (numero == 3){
			//TIENE EL .CERRAR PARA BLOQUEAR LA VENTANA
			this.puertaTraIzq.getVentanaPuerta().cerrar();
		}else if (numero == 4){
			//TIENE EL .CERRAR PARA BLOQUEAR LA VENTANA
			this.puertaTraDer.getVentanaPuerta().cerrar();
		}
	}

  //TO STRING
  public String toString(){
    return this.motorCoche + "\n" + "PUERTA CONDUCTOR: " + this.puertaDelIzq + "\n" + "PUERTA COPILOTO: " + this.puertaDelDer + "\n" + "PUERTA TRASERA IZQ: " + this.puertaTraIzq + "\n" + "PUERTA TRASERA DER: " + this.puertaTraDer;

  }

}
