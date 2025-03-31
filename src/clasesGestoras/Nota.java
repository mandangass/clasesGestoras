package clasesGestoras;

public class Nota {

	private static int contadorNotas = 0;
	private int id;
	private int prioridad;
	private String texto;

	public Nota(int prioridad, String texto) {
		id = contadorNotas++;
		this.prioridad = prioridad;
		this.texto = texto;
	}

	public Nota(String texto) {
		id = contadorNotas++;
		this.prioridad = 0;
		this.texto = texto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getNota() {
		return texto;
	}

	public void setNota(String nota) {
		this.texto = nota;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", prioridad=" + prioridad + ", nota=" + texto + "]";
	}

}
