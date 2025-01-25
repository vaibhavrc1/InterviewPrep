package datastructure.map;

import java.util.List;
import java.util.Set;

public interface MyMap<K, V> {

    void put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    V remove(K key);

    boolean isEmpty();

    Set<K> keySet();

    List<V> values();

    void printMap();

    int size();
}
