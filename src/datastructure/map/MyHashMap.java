package datastructure.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int bucketSize;
    private int mapSize;

    private LinkedList<Node>[] buckets;

    public MyHashMap() {
        initializeMap(4);
    }

    @SuppressWarnings("unchecked")
    private void initializeMap(int bucketSize) {
        this.mapSize = 0;
        this.bucketSize = bucketSize;
        this.buckets = new LinkedList[this.bucketSize];
        for (int i = 0; i < this.bucketSize; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    @Override
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> linkedList = buckets[bucketIndex];
        int nodeIndex = getNodeIndex(linkedList, key);
        if (nodeIndex == -1) {
            linkedList.add(new Node(key, value));
            this.mapSize++;
        } else {
            Node node = linkedList.get(nodeIndex);
            node.value = value;
        }

        double lambda = (double) this.mapSize / this.bucketSize;
        int threshold = 2;
        if (lambda >= threshold) {
            rehash();
        }
    }

    @Override
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> linkedList = buckets[bucketIndex];
        int nodeIndex = getNodeIndex(linkedList, key);
        if (nodeIndex == -1) {
            return null;
        }
        return linkedList.get(nodeIndex).value;
    }

    @Override
    public boolean containsKey(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> linkedList = buckets[bucketIndex];
        int nodeIndex = getNodeIndex(linkedList, key);
        return nodeIndex != -1;
    }

    @Override
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> linkedList = this.buckets[bucketIndex];
        int nodeIndex = getNodeIndex(linkedList, key);
        if (nodeIndex == -1) {
            return null;
        }
        this.mapSize--;
        return linkedList.remove(nodeIndex).value;
    }

    @Override
    public boolean isEmpty() {
        return this.mapSize == 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet = new HashSet<>();
        for (LinkedList<Node> linkedList : this.buckets) {
            for (Node node : linkedList) {
                keySet.add(node.key);
            }
        }
        return keySet;
    }

    @Override
    public List<V> values() {
        List<V> values = new ArrayList<>();
        for (LinkedList<Node> linkedList : this.buckets) {
            for (Node node : linkedList) {
                values.add(node.value);
            }
        }
        return values;
    }

    @Override
    public void printMap() {
        for (LinkedList<Node> linkedList : buckets) {
            for (Node node : linkedList) {
                System.out.println("Key : " + node.key + " | Value : " + node.value);
            }
        }
    }

    @Override
    public int size() {
        return this.mapSize;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % this.bucketSize;
    }

    private int getNodeIndex(LinkedList<Node> linkedList, K key) {
        for (int i = 0; i < linkedList.size(); i++) {
            Node node = linkedList.get(i);
            if (node.key == key) {
                return i;
            }
        }
        return -1;
    }

    private void rehash() {
        LinkedList<Node>[] oldBuckets = this.buckets;
        initializeMap(this.bucketSize * 2);
        for (LinkedList<Node> linkedList : oldBuckets) {
            for (Node node : linkedList) {
                put(node.key, node.value);
            }
        }
        System.out.println("Map rehashed. New bucket size " + this.bucketSize);
    }
}
