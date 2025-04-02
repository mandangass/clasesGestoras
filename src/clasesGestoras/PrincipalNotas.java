package clasesGestoras;

import java.util.Scanner;

public class PrincipalNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GestionNotas gestionNotas = new GestionNotas();

		boolean salir = false;
		int opcion;

		while (!salir) {
			System.out.println("1. añadir nota");
			System.out.println("2. mostrar datos notas");
			System.out.println("3. n notas prio alta");
			System.out.println("4. eliminar prioridad baja");
			System.out.println("5. mostrar numero notas");
			System.out.println("6. modificar notas");
			System.out.println("7. archivar nota");
			System.out.println("8. mostrar notas archivadas");
			System.out.println("9. desactivar nota");
			System.out.println("10. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado la opcion 1");
				System.out.println("vas a introducir prioridad? (s/n)");
				String seleccion = sc.next();

				Nota nota1 = null;

				if (seleccion.equalsIgnoreCase("s")) {
					System.out.println("introduzca prioridad de la nota");
					int prioridad = sc.nextInt();

					System.out.println("introduzca el texto de la nota");
					String texto = sc.next();

					nota1 = new Nota(prioridad, texto);

					gestionNotas.aniadirNota(texto, prioridad);
				}
				if (seleccion.equalsIgnoreCase("n")) {

					System.out.println("introduzca el texto de la nota");
					String texto = sc.next();

					nota1 = new Nota(texto);

					gestionNotas.aniadirNota(texto);
				} else {
					System.out.println("error al seleccionar");
				}
				break;

			case 2:
				System.out.println("Has seleccionado la opcion 2");
				String datosNotas = gestionNotas.mostrarNotasPendientes();
				if (datosNotas == null) {
					System.out.println("no hay notas pendientes");
				} else {
					System.out.println(datosNotas);
				}
				break;

			case 3:
				System.out.println("Has seleccionado la opcion 3");
				datosNotas = gestionNotas.mostrarNotasPrioridadAlta();
				if (datosNotas == null) {
					System.out.println("no hay notas prioridad alta");
				} else {
					System.out.println(datosNotas);
				}
				break;

			case 4:
				System.out.println("Has seleccionado la opcion 4");
				int numEliminadas = gestionNotas.eliminarPrioBaja();
				System.out.println(numEliminadas);
				break;

			case 5:
				System.out.println("Has seleccionado la opcion 5");
				int numNotas = gestionNotas.numeroNotas();
				System.out.println(numNotas);
				break;

			case 6:
				System.out.println("Has seleccionado la opcion 6");
				break;

			case 7:
				System.out.println("Has seleccionado la opcion 7");
				break;

			case 8:
				System.out.println("Has seleccionado la opcion 8");
				break;
			case 9:
				System.out.println("Has seleccionado la opcion 9");
				break;

			case 10:
				salir = true;
				break;

			default:
				System.out.println("Opción incorrecta");
			}
		}
	}

}
