package clasesGestoras;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionCoches {

	private ArrayList<Coche> listaCoches;

	public GestionCoches() {
		listaCoches = new ArrayList<>();
	}

	public void aniadirCoche(Coche coche) {
		listaCoches.add(coche);
	}

	public void aniadirCoche(String marca, String modelo, String matricula) {
		Coche coche = new Coche(marca, modelo, matricula);
		listaCoches.add(coche);

	}

//	public boolean eliminar(String matricula) {
//		Iterator<Coche> iterator = listaCoches.iterator();
//		while (iterator.hasNext()) {
//			Coche coche = (Coche) iterator.next();
//			if (coche.getMatricula().equalsIgnoreCase(matricula)) {
//				iterator.remove();
//				return true;
//			}
//		}
//		return false;
//	}

	public int eliminar(String matricula) {
		if (listaCoches.isEmpty()) {
			return -1;
		}
		Iterator<Coche> iterator = listaCoches.iterator();
		while (iterator.hasNext()) {
			Coche coche = (Coche) iterator.next();
			if (coche.getMatricula().equalsIgnoreCase(matricula)) {
				iterator.remove();
				return 1;
			}
		}
		return 0;
	}

	public void vaciar() {
		listaCoches.clear();
	}

	public int contar() {
		return listaCoches.size();
	}

	public String buscar(String matricula) {
		for (Coche coche : listaCoches) {
			if (coche.getMatricula().equalsIgnoreCase(matricula)) {
				return coche.getMarca() + " " + coche.getModelo();
			}
		}
		return null;
	}
}
