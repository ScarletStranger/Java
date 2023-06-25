package seminar4;

import java.util.ArrayList;
import java.util.Collections;

public class collectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        age.add(52);
        age.add(44);
        age.add(37);
        age.add(59);
        age.add(15);
        id.add(0);
        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);
        Collections.sort(id, (o1, o2) -> age.get(o1) - age.get(o2));
        id.forEach(n -> System.out.println(name.get(n) + age.get(n)));
    }
}
