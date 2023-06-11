package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int res = random_number();
        int bit_shift = (bit(res));
        Integer[] non_div = non_dividable(res, bit_shift);
        Arrays.stream(non_div).forEach(integer -> System.out.println(integer));
        Integer[] div = dividable(res, bit_shift);
        Arrays.stream(div).forEach(integer -> System.out.println(integer));
    }

    public static int random_number() {
        int i = new Random().nextInt(0, 2001);
        // System.out.println(i);
        return i;
    }

    public static int bit(int i) {
        int n = 1 << 15;
        while (i < n)
            n >>= 1;
        // System.out.println(n);
        return n;
    }

    public static Integer[] non_dividable(int res, int bit_shift) {
        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        int temp = 0;
        while (res >= (Short.MIN_VALUE)) {
            if (res % bit_shift == 0) {
                res--;
            }
            if (res % bit_shift != 0) {
                temp = res;
                ArrayList2.add(temp);
                res--;
            }
        }
        Integer[] m2 = new Integer[ArrayList2.size()];
        return ArrayList2.toArray(m2);
    }

    public static Integer[] dividable(int res, int bit_shift) {
        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        int temp = 0;
        while (res <= (Short.MAX_VALUE)) {
            if (res % bit_shift != 0) {
                res++;
            }
            if (res % bit_shift == 0) {
                temp = res;
                ArrayList1.add(temp);
                res++;
            }
        }
        Integer[] m1 = new Integer[ArrayList1.size()];
        return ArrayList1.toArray(m1);
    }
}
