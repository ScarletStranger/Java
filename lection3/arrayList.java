package lection3;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
