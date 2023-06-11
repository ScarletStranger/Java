package lection1;

public class cycles {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        int value1 = 321;
        int count1 = 0;
        do {
            value1 /= 10;
            count1++;
        } while (value1 != 0);
        System.out.println(count1);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
        int arr[] = new int[]{1,2,3,4,5,6,77};
        for(int item:arr){
            System.out.println(item);
        }
    }
}
