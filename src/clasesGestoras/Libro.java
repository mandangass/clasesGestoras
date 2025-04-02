package clasesGestoras;

import java.util.Objects;

public class Libro {

	private String isbn,titulo,autor;
	private boolean prestado;
	
	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.prestado=false;
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
		return prestado;
	}
	public void setEstado(boolean estado) {
		this.prestado = estado;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", estado=" + prestado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, prestado, isbn, titulo);
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
		return Objects.equals(autor, other.autor) && prestado == other.prestado && Objects.equals(isbn, other.isbn)
				&& Objects.equals(titulo, other.titulo);
	}

	
	
	
}
