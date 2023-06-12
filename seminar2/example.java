package seminar2;

public class example {
    public static void main(String[] args) {
        String str;
        stringBuilder builder = new stringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str += Character.getName(i);
        }
        System.out.println("String result " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(Character.getName(i));
        }
        System.out.println("stringBuilder result " + (System.currentTimeMillis() - start));
    }
}
