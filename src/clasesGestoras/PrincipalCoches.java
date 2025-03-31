package clasesGestoras;

public class PrincipalCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionCoches concesionario = new GestionCoches();

		Coche coche1 = new Coche("citroen", "c4", "1111cls");
		concesionario.aniadirCoche(coche1);

		// USAMOS EL METODO 2
		concesionario.aniadirCoche("peugeot", "207", "5555ccc");
		;

		// METEMOS LA MATRICULA A MANO Y LA ELIMINAMOS
		String matriculaEliminar = "1111cls";
//		boolean resultadoEliminar = concesionario.eliminar(matriculaEliminar);
//		if (resultadoEliminar) {
//			System.out.println("se pudo eliminar");
//		} else {
//			System.out.println("coche no existe");
//		}
		int resultadoEliminar = concesionario.eliminar(matriculaEliminar);
		
		//USANDO DEVOLVER UN ENTERO Y NO UN BOOLEAN PORQUE HAY MAS DE UNA OPCION
		if (resultadoEliminar == 1) {
			System.out.println("se pudo eliminar");
		}
		if (resultadoEliminar == 0) {
			System.out.println("coche no existe");
		}
		if (resultadoEliminar == -1) {
			System.out.println("lista vacia");
		}
		int numeroCoches = concesionario.contar();
		System.out.println("hay " + numeroCoches + " coches");
	}

}
