package clasesGestoras;

import java.util.Scanner;

public class PrincipalNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
	        boolean salir = false;
	        int opcion;
	         
	        while(!salir){
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
	                   
	            switch(opcion){
	                case 1:
	                    System.out.println("Has seleccionado la opcion 1");
	                    break;
	                case 2:
	                    System.out.println("Has seleccionado la opcion 2");
	                    break;
	                case 3:
	                    System.out.println("Has seleccionado la opcion 3");
	                    break;
	                case 4:
	                    salir=true;
	                    break;
	                default:
	                    System.out.println("Opción incorrecta");
	            }  
	        }
	}

}
