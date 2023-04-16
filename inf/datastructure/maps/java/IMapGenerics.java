public interface IMapGenerics<K,V> {
    void add(K key, V value);
    V remove(K key);
    V get(K key);
    K[] keys();
    V[] values();
}
