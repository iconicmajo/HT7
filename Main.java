import java.io.File;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Majo!
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		String english = "";
		String spanish = "";
		
		System.out.println("**************DICCIONARIO**************");
		System.out.println("***************TRADUCTOR***************");
		System.out.println("Que desea hacer?");
		System.out.println("1. Ver diccionario");
		System.out.println("2. Agregar al diccionario");
		System.out.println("3. Traducir");
		int opcion = teclado.nextInt();
		teclado.nextLine();
		
		//El usuario ingresa la opcion
	while(opcion!=4) {

		if (opcion == 1) { 
				System.out.println("Imprimir todo el diccionario: ");
		}
		if(opcion ==2) {
			System.out.println("Ingrese la palabra en ingles: ");
            english = teclado.nextLine();
            System.out.println("Ingrese la palabra en espanol: ");
            spanish = teclado.nextLine();
           /* if(map.containsKey(name)) {
            	type = map.get(name);
            	baraja.put(name, type);
            	System.out.println("Carta agregada correctamente");
            	}
            else {
            	System.out.println("Error");
            }*/
		}
		if(opcion ==3) {
			System.out.println("Usted ha elegido traducir el documento ");
		}
				
		else {
			System.out.println("Ingrese una opcion valida: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
		}
		
	}
			
}

	public static Map leer(Map<String, String> map){
		
		try {
	           System.out.println("-------------------------------------");
	           Scanner read = new Scanner(new File("C:\\Users\\Majo!\\Desktop\\HTseven\\src\\diccionario.txt"));
	           String english ="";
	           String spanish ="";

	           
	          while((read.hasNextLine()))
	       
	            {
	        	 
	        	 String line = read.nextLine();
	             int i = line.lastIndexOf(", ");
	             english = line.substring(0,i).trim();
	             spanish =line.substring(i+1).trim();
	             //map.put(first, last);
	            }
	     
	            }

	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		return map;

}
}
