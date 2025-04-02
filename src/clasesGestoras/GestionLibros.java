package clasesGestoras;

import java.lang.reflect.Array;

public class GestionLibros {

	private Libro[] arrayLibros;
	private int numLibros;

	public GestionLibros(int size) {
		arrayLibros = new Libro[size];
		numLibros = 0;
	}

	public GestionLibros() {
		arrayLibros = new Libro[100];
		numLibros = 0;
	}

	public boolean aniadirLibro(String isbn, String titulo, String autor) {
		if (numLibros < arrayLibros.length) {
			arrayLibros[numLibros] = new Libro(isbn, titulo, autor);
			numLibros++;
			return true;
		} else {
			return false;
		}
	}
	
//	public boolean prestarLibro(String isbn) {
		//Devuelve 1 si se prestó
		//0 si ya está prestado
		//-1 si no existe el libro
	
	}

