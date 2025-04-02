package clasesGestoras;

import java.util.Objects;

public class Libro {

	private String isbn,titulo,autor;
	private boolean estado;
	
	public Libro(String isbn, String titulo, String autor, boolean estado) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.estado = estado;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, estado, isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && estado == other.estado && Objects.equals(isbn, other.isbn)
				&& Objects.equals(titulo, other.titulo);
	}

	
	
	
}
