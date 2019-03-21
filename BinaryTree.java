/**
 * 
 */

/**
 * @author Majo!
 *Clase obtenida del libro Java structures
 */
import java.util.Iterator;
public class BinaryTree<E>{
	
	
	public BinaryTree() {
	// post: constructor that generates an empty node
	}
	public BinaryTree(E value) {
	// post: returns a tree referencing value and two empty subtrees
	}
	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right) {
	// post: returns a tree referencing value and two subtrees
	}
	public BinaryTree<E> left(){
	// post: returns reference to (possibly empty) left subtree
		return left();
	}
	public BinaryTree<E> parent(){
	// post: returns reference to parent node, or null
		return parent();
	}
	public void setLeft(BinaryTree<E> newLeft) {
	// post: sets left subtree to newLeft
	// re-parents newLeft if not null
	}
	protected void setParent(BinaryTree<E> newParent) {
	// post: re-parents this node to parent reference, or null
	}
	/*public Iterator<E> iterator(){
	// post: returns an in-order iterator of the elements
	}
	public boolean isLeftChild() {
	// post: returns true if this is a left child of parent
	}*/
	public E value() {
	// post: returns value associated with this node
		return value();
	}
	public void setValue(E value) {
	// post: sets the value associated with this node
		value = value;
	}
}
