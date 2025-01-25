package datastructure.map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyHashMap<>();
        map.put("India", 30);
        map.put("China", 20);
        map.put("India", 40);
        map.put("US", 45);
        map.put("Canada", 35);
        map.put("Japan", 15);
        map.put("Nepal", 10);
        map.put("Bhutan", 10);
        map.put("UAE", 12);
        System.out.println(map.size());
        System.out.println(map.remove("US"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(String key : map.keySet()){
            map.remove(key);
        }
        System.out.println(map.size());
    }
}
