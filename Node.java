/**
 * @author Majo!
 *
 */

public class Node<E> {
	
    private Association<String, String> value; 
    private Node<E> parent; 
    private Node<E> left, right; 
    
    
    public Node(String ingles, String espanol)
    {
        value = new Association<>(ingles, espanol);
        parent = null; 
        left = right = null;
    }

    /**
     * Constructor que llama el nodo
     */
    public Node() {
        
    }
   
    public Association<String, String> getValue()
    {
        return value;
    }
    
    public String getEspanol()
    {
        return value.theValue;
    }
    
    public String getKey()
    {
        return value.getKey(); 
    }
    
    public Node<E> getLeft()
    {
        return left;
    }
    
    public Node<E> getRight()
    {
        return right;
    }
    
    public Node<E> getParent()
    {
        return parent;
    }
    
    public void setLeft(Node left)
    {
        this.left = left;
    }
   
    public void setRight(Node right)
    {
        this.right = right;
    }
    
    public void setParent(Node newParent)
    // post: re-parents this node to parent reference, or null
    {
            parent = newParent;
    }
    
    @Override
    public String toString()
    {
       String hilo = "\t("+ value.theKey + ", " + value.theValue + ")";
       return hilo;
    }
    
    
    public String search(String value){
        if (value.equals(this.value.getKey())){
            
            return this.value.theValue;
        }else if (value.compareTo(this.value.getKey()) < 0) {
            
            if (left == null){
                return "*" + value + "*";
            }else{
                return left.search(value);
            }
        }else if(value.compareTo(this.value.getKey()) > 0) {
            
            if (right == null){
                return "*" + value + "*";
            }else{
                return right.search(value);

            }
        }
        
        return "*" + value + "*";
    }
    
    
}

