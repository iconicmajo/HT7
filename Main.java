import java.io.File;
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
		String english ="";
        String spanish ="";
        BinaryTree<Association<String,String>> tree = new BinaryTree();
        tree = leerDic(tree);
		//<Association<String,String>> tree =new BinaryTree(null);
		System.out.println("**************DICCIONARIO**************");
		System.out.println("***************TRADUCTOR***************");
		System.out.println("Fuciones");
		System.out.println("1. Ver diccionario");
		System.out.println("2. Traducir");
		int opcion = teclado.nextInt();
		teclado.nextLine();
	while(opcion!=4) {

		if (opcion == 1) { 
				System.out.println("Imprimir todo el diccionario: ");
				System.out.println();
				
		}
		if(opcion ==2) {
			System.out.println("Traducir el documento: ");
            
		}
				
		else {
			System.out.println("Ingrese una opcion valida: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
		}
		
	}
			
}

	public static BinaryTree<Association<String,String>> leerDic(BinaryTree<Association<String,String>> tree){
		
		try {
	           System.out.println("-------------------------------------");
	           Scanner read = new Scanner(new File("C:\\Users\\Majo!\\Desktop\\HTseven\\src\\diccionario.txt"));
	           String english ="";
	           String spanish ="";
	           
	          while((read.hasNextLine()))
	       
	            {
	        	 
	        	 String line = read.nextLine();
	             int i = line.lastIndexOf(", ");
	             english = line.substring(0,i).trim().toLowerCase();
	             spanish =line.substring(i+1).trim().toLowerCase();
	             System.out.println(english+spanish);
	             Association<String,String> asso = new Association<String,String>(english, spanish);
	             System.out.println(asso);
	            // tree.addNodo(asso);
	        	 //tree.insert(asso);
	            }
	     
	            }

	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		return tree;

}
	
/*public static ArrayList<String> leerText(ArrayList<String> oracion){
	
	 	//ArrayList<String> oracion = new ArrayList<>();
		try {
	           System.out.println("-------------------------------------");
	           Scanner reado = new Scanner(new File("C:\\Users\\Majo!\\Desktop\\HTseven\\src\\text.txt"));
	          
	           while((reado.hasNextLine())){
	        	 String line = reado.nextLine();
	            }
	     
	            }

	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		return oracion;

}*/
}
