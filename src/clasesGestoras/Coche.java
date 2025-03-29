package clasesGestoras;

public class Coche {

	private String marca, modelo, matricula;
	private int velocidad;
	private boolean arrancado;

	public Coche(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public boolean isArrancado() {
		return arrancado;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", velocidad=" + velocidad
				+ ", arrancado=" + arrancado + "]";
	}

	public void arrancar() {
		arrancado = true;
	}

	public void parar() {
		arrancado = false;
	}

	public int acelerar(int aceleracion) {

		if (arrancado) {
			velocidad += aceleracion;
		}
		if (velocidad > 120) {
			velocidad = 120;
		}
		return velocidad;

	}

}
