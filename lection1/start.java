package lection1;

public class start {
    public static void main(String[] args) {
        short age = 10;
        int salary = 541561;
        float e = 2.7f;
        double pi = 3.1415;
        char ch = '1';
        boolean flag1 = 123 <= 234;
        boolean flag2 = 234 <= 123;
        boolean flag3 = flag1 ^ flag2;
        System.out.println(age); // 10
        System.out.println(salary); // 541561
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
        System.out.println(ch); // 1
        System.out.println(flag1); // true
        System.out.println(flag3); // true
        System.out.println(Integer.MAX_VALUE);

        int a = 1, b = 2;
        int c = a+b;
        String res = a +"+"+b+"=" + c;
        System.out.println(res);

        int a1 = 1, b1 = 2;
        int c1 = a+b;
        String res1 = a1 +"+"+b1+"=" + c1;
        System.out.println(res1);
    }
}
