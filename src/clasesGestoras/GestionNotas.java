package clasesGestoras;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionNotas {

	private ArrayList<Nota> listaNotasPendientes;
	private ArrayList<Nota> listaNotasArchivadas;

	public GestionNotas() {
		listaNotasPendientes = new ArrayList<Nota>();
		listaNotasArchivadas = new ArrayList<Nota>();
	}

	public boolean aniadirNota(String texto) {
		Nota nota1 = new Nota(texto);
		if (listaNotasPendientes.add(nota1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean aniadirNota(String texto, int prioridad) {
		Nota nota1 = new Nota(prioridad, texto);
		if (listaNotasPendientes.add(nota1)) {
			return true;
		} else {
			return false;
		}
	}

	public String mostrarNotasPendientes() {
		String resultado = null;
		if (listaNotasPendientes.isEmpty()) {
			return resultado;
		}

		resultado = "";

		for (int i = 0; i < listaNotasPendientes.size(); i++) {
			resultado += "Nota Pendiente " + (i + 1) + ": " + listaNotasPendientes.get(i).toString() + "\n";
		}
		return resultado;
	}
	
	
	public String mostrarNotasPrioridadAlta ()
	{		
		String resultado = null;
		
		for (int i = 0; i < listaNotasPendientes.size(); i++) 				
			if (listaNotasPendientes.get(i).getPrioridad() == 1)	//Si la nota tiene una prioridad alta 
				resultado += "Nota " + (i + 1) + ": " + listaNotasPendientes.get(i).toString() + "\n";;

		return resultado;	
	}

	public int eliminarPrioBaja() {
		int notasBorradas = 0;
		Iterator<Nota> iterator = listaNotasPendientes.iterator();
		while (iterator.hasNext()) {
			Nota nota = (Nota) iterator.next();
			if (nota.getPrioridad() == -1) {
				iterator.remove();
				notasBorradas++;
			}
		}
		return notasBorradas;
	}

	public int numeroNotas() {
		return listaNotasPendientes.size();
	}

	public int existe(int identificador) {
		int posicionNota = -1;
		for (int i = 0; i < listaNotasPendientes.size(); i++) {
			posicionNota = i;
		}
		return posicionNota;
	}

	public void modificarPrioridad(int posicionNota, int prioridad) {
		listaNotasPendientes.get(posicionNota).setPrioridad(prioridad);
	}

	public void modificarTexto(int posicionNota, String texto) {
		listaNotasPendientes.get(posicionNota).setNota(texto);
	}

	public void modificarPrioYtexto(int posicionNota, String texto, int prioridad) {
		listaNotasPendientes.get(posicionNota).setPrioridad(prioridad);
		listaNotasPendientes.get(posicionNota).setNota(texto);
	}

	public boolean archivarNota(int id) {
		boolean encontrada = false;

		for (int i = 0; i < listaNotasPendientes.size(); i++) {
			if (listaNotasPendientes.get(i).getId() == id) {
				listaNotasArchivadas.add(listaNotasPendientes.get(i));
				listaNotasPendientes.remove(i);
				encontrada = true;
			}
		}
		return encontrada;
	}
	
	
	public boolean desarchivarNota(int id) {
		boolean encontrada = false;
		
		for (int i = 0; i < listaNotasArchivadas.size(); i++) {
			if(listaNotasArchivadas.get(i).getId()==id) {
				listaNotasPendientes.add(listaNotasArchivadas.get(i));
				listaNotasArchivadas.remove(i);
				encontrada=true;
			}
		}
		return encontrada;
	}

	
}
