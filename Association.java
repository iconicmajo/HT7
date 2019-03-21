/**
 * 
 */

/**
 * @author Majo!
 *
 */
public class Association<K,V> {
	private K key;
	private V value;
	/**
	 * @param key
	 * @param value
	 */
	public Association(K key, V value) {
		this.key = key;
		this.value = value;
	}
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Association [key=" + key + ", value=" + value + "]";
	}
	
	
}
