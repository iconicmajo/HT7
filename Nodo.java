/**
 * 
 */

/**
 * @author Majo!
 *Esta clase fue obtenida de https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo/
 */
public class Nodo {
	private int value;
	 
    private Nodo parent;
    private Nodo left;
    private Nodo right;
 
    /* Constructor */
    public Nodo(int valor) {
        this.value = value;
    }
 
    /* Setters y Getters */
    public void setValor(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
 
    public Nodo getParent() {
        return parent;
    }
    
    public Nodo getRight() {
        return right;
    }
 
    public Nodo getLeft() {
        return left;
    }
    public void setParent(Nodo parent) {
        this.parent = parent;
    }
 
    public void setLeft(Nodo left) {
        this.left = left;
    }
 
    public void setRight(Nodo right) {
        this.right = right;
    }
   
 
}