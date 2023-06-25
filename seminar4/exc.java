package seminar4;

import java.util.HashMap;
import java.util.Random;

public class exc {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
            map.putIfAbsent(i, new Random().nextInt(100));
        System.out.println(map);
        for (int n : map.values()) {
            if (n % 2 == 0)
                System.out.println(n);
        }
    }
}
