/**
 * 
 */

/**
 * @author Majo!
 *Clase obtenida de https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo/
 */

public class BinaryTree {
 
    /* Atributos */
    private Nodo raiz;
 
    /* Contructories */    
    public BinaryTree( int valor ) {
        this.raiz = new Nodo( valor );
    }
 
    public BinaryTree( Nodo raiz ) {
        this.raiz = raiz;
    }
 
    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    private void addNodo( Nodo nodo, Nodo raiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {
            this.setRaiz(nodo);
        }
        else {
            if ( nodo.toString().equals(raiz.toString()) ) {
                if (raiz.getLeft() == null) {
                    raiz.setLeft(nodo);
                }
                else {
                    addNodo( nodo , raiz.getLeft() );
                }
            }
            else {// if (newNode.toString().compareTo(node.toString()) > 0){
                if (raiz.getRight() == null) {
                    raiz.setRight(nodo);
                }
                else {
                    addNodo( nodo, raiz.getRight() );
                }
            }
        }
    }
 
    public void addNodo( Nodo nodo ) {
        this.addNodo( nodo , this.raiz );
    }
    
    //fRAGMENTO EXTRAIDO DE Geeksforgeeks.com
    public boolean find(Nodo nodo, String val) {
    	if(raiz ==null) {
    		return false;
    	}
    		if( nodo.toString().equals(nodo)) {
    			return true; 
    		}
    		else {
    			if( nodo.toString().equals(nodo)) {
        			return true; //ver si se modifica esto
        		}
    		}
    		return true;
    	}
    
    //Codigo de https://stackoverflow.com/questions/43825134/binary-tree-in-order-sorting
    public void inOrder()          
    {
        inOrder(raiz);
    }
    
    public void inOrder(Nodo nodo)
    {
        if (nodo != null)
        {
            inOrder(nodo.getLeft());
            System.out.println(nodo.getParent());
            inOrder(nodo.getRight());
        }
    }
}
