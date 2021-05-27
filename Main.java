package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/***MENSAJE INICIAL DEL PROGRAMA***/
		Imagen Inicio = new Imagen();
		Inicio.Mensaje();
		
		
		/***ESTADO DEL PROGRAMA***/
		boolean on = true;
		/**INICIO DEL PROGRAMA**/
		do {
		
			/*SOLICITANDO UN COMANDO*/
		Scanner inputComand = new Scanner (System.in);
		System.out.print("~$ : ");
		String output = inputComand.nextLine();
		
		/*INSTANCIAS DE CLASES*/
		Comand_list comandDate = new Comand_list ();
		AritmetichFuntions resultado = new AritmetichFuntions();
		Help help = new Help ();
		
		
		if(output.equals(comandDate.comand[0])) {
			resultado.suma();
		}else if (output.equals(comandDate.comand[1])) {
			resultado.resta();
		}else if (output.equals(comandDate.comand[2])) {
			resultado.multiplicacion();
		}else if (output.equals(comandDate.comand[3])) {
			resultado.division();
		}else if (output.equals(comandDate.comand[4])) {
			resultado.residuo();
		}else if (output.equals(comandDate.comand[5])) {
			help.Comand_list();
		}else if (output.equals(comandDate.comand[6])) {
			on = false;
		}
		
		else {
			System.out.println("Comando no encontrado");
			System.out.println("Ingresa help para más información");
		}
	}while(on);
	
	
	
	System.out.println("Programa finalizado");
	
	
}	
	
		
	}
	
		
	
		
	

		
		
			
		
		
			
		
		
			
		


