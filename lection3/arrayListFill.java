package lection3;

import java.util.Arrays;
import java.util.List;

public class arrayListFill {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("29");
        StringBuilder month = new StringBuilder("11");
        StringBuilder year = new StringBuilder("1999");
        StringBuilder[] date = new StringBuilder[] { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 11, 1999]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1999]
    }
}
