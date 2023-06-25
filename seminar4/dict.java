package seminar4;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;


public class dict {
    public static void main(String[] args) {
        Object object = new Object();
        object.hashCode();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "!");
        map.putIfAbsent(1, "j");
        map.replace(1, "j");
        map.replace(1, "!", "j");
        map.remove(1);
        map.remove(1, "!");
        map.get(1);
        map.getOrDefault(1, "#");

        Set<Integer> se = map.keySet();// возворащает список ключей
        for (int i = 0; i < se.size(); i++) {
            System.out.println(map.get((int) se.toArray()[i]));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        map.containsKey(1);
        map.containsValue("j");

        map.compute(1, (key, value) -> value != null ? value + key : "0");
        // позволяет взаимодействовать с элементом по ключу
        map.computeIfPresent(1, (key, value) -> value != null ? value + key : "0");
        // то же, что и выше, но с проверкой наличия такого ключа
        map.computeIfAbsent(1, value -> value != null ? value + "!" : "0");
        // то же, что и в 32 строке
        // compute нужны для присваивания функций к ключам
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map.clear();
        for (int i = 0; i < 10; i++) {
            map1.put(i, i);
        }
        for (int i = 0; i < 10; i++) {
            map2.put(i, new Random().nextInt(50));
        }
        System.out.println(map1);
        System.out.println(map2);
        map1.replaceAll((key, value) -> map2.computeIfPresent(value, (x, y) -> y * key));
        System.out.println(map2);
    }
}
