package scl.edu.gt;

public class Help {
	 public static void Comand_list() {
		
		 Comand_list datos = new Comand_list();
			
			int cantidadDeComandos = datos.comand.length;
			
			for(int i = 0;i<cantidadDeComandos;i++) {
				
				System.out.println("| *"+datos.comand[i]+"*");
				System.out.println(datos.information[i]);
				System.out.println("-----------------------------------------------------------");
			}
			
		}
	}