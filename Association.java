import java.util.Map;

/**
 * @author Majo!
 *
 */

public class Association<K,V> implements Map.Entry<K,V>
{
    
    protected K theKey; 
    // the key of the key-value pair
    
    protected V theValue;
    // the value of the key-value pair
   
    public Association(K key, V value)
    {
        
        theKey = key;
        theValue = value;
    }

    public Association(K key)
    {
        this(key,null);
    }

    
    @Override
    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }
    
    
    @Override
    public int hashCode()
    {
        return getKey().hashCode();
    }
    
    @Override
    public V getValue()
    {
        return theValue;
    }

    @Override
    public K getKey()
    {
        return theKey;
    }

    @Override
    public V setValue(V value)
    {
        V oldValue = theValue;
        theValue = value;
        return oldValue;
    }
}

