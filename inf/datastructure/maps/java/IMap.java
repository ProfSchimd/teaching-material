/**
 * This interface represents a map abstract data type that can
 * store pairs (key,value) with both keys and values of type
 * Object.
 */
interface Map {
    /**
     * Adds a the (key,value) pair to the map
     * 
     * @param key the key object
     * @param value the value object
     */
    void add(Object key, Object value);
    /**
     * Removes the value corresponding to the given key, the removed
     * element is returned. The behavior of the method when kay is
     * not present, is an implementation detail not defined here.
     * 
     * @param key the key object
     * @return the removed value
     */
    Object remove(Object key);
    /**
     * Returns the value present corresponding to the given key.
     * 
     * @param key the key object
     * @return the value associated to key
     */
    Object get(Object key);
    /**
     * Returns the array of all keys
     * 
     * @return the stored keys
     */
    Object[] keys();
    /**
     * Returns the values stored in the map
     * 
     * @return the stored values
     */
    Object[] values();

    /**
     * Returns the number if paris stored in the map.
     * 
     * @return the number of pairs stored
     */
    int size();

    /**
     * Returns {@code True} if the map has no stored pairs, {@code} False otherwise}.
     * 
     * @return Whether or not the map is empty.
     */
    boolean isEmpty();
}