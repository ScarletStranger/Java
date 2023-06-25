package lection5;

import java.util.HashMap;
import java.util.Map;

public class hashmapentry {
    public static void main(String[] args) {
        Map<Integer, String> dbMap = new HashMap<>();
        dbMap.putIfAbsent(1, "один");
        dbMap.put(2, "два");
        dbMap.put(3, "три");
        System.out.println(dbMap);

        for (var item : dbMap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
