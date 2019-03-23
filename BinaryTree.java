/**
 * 
 */

/**
 * @author Majo!
 *Esta clase la obtuve de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 *Otras cosas son genericas obtenidas del libro JavaStructures
 */

public class BinaryTree<E> 
{
    private Node root;
    

     // Metodo que llama al BinarySearchTree.
     
    public BinaryTree()
    // post: constructor that generates an empty node
    {
        root = null;
    }
   
     //Obtenido de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
     
    public void insert(Node newNode) 
    {
        root = insertRec(root, newNode);
    }
     
 
    public Node insertRec(Node root, Node nodo) 
    {
 
        if (root == null) 
        {
            root = nodo;
            return root;
        }
 
   
        else if ((root.getKey()).compareTo(nodo.getKey()) > 0) //devuelve positivo si el primer string es menor que el segundo
        {
            root.setLeft(insertRec(root.getLeft(), nodo)); //al nodo actual, le pone el nodo del argumento como hijo izquierdo
            root.getLeft().setParent(root); //crea el vinculo padre-hijo entre nodos
        }
        else if ((root.getKey().compareTo(nodo.getKey()) < 0))
        {
            root.setRight(insertRec(root.getRight(), nodo));//al nodo actual, le pone el nodo del argumento como hijo izquierdo
            root.getRight().setParent(root); //crea el vinculo padre-hijo entre nodos
        }
 
        
      return root;
    }

     //Obtenido de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 
    public String search(String dato){
        
        if (root == null){
            return "*" + dato + "*"; 
        }
        else{
            return root.search(dato);
        }

    }

     // Obtenido de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

    public void inorder()  {
       inorder(root);
    }

     //Obtenido de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.println(root.toString());
            inorder(root.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }
    
    
}

