package lection5;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        //Map - это множество коллекций, работающих с данными по принципу <Ключ/Значение>
        Map<Integer, String> dbMap = new HashMap<>();
        dbMap.putIfAbsent(1, "один");
        dbMap.put(2, "два");
        dbMap.put(null, "!null");
        System.out.println(dbMap);// {null, "!null", 1, "один", 2, "два"}
        System.out.println(dbMap.get(44));
        //db.remove(null);
        System.out.println(dbMap);// {"один", 2, "два"}
        System.out.println(dbMap.containsValue("один"));// true
        // System.out.println(dbMap.containsValue(1));//false
        // System.out.println(dbMap.containsKey("один"));//false
        System.out.println(dbMap.containsKey(1));//true
        System.out.println(dbMap.keySet());
        System.out.println(dbMap.values());
    }   
}
 