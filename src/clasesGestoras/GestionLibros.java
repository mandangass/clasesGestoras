package clasesGestoras;

import java.lang.reflect.Array;

public class GestionLibros {

	Libro[] libros;

	public boolean introducirLibro(String isbn, String titulo, String autor, boolean estado) {
		Libro libro = new Libro(isbn, titulo, autor, estado);
		return true;
	}
}
