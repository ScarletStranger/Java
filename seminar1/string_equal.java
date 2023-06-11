package seminar1;

public class string_equal {
    public static void main(String[] args) {
       String str = "Hellow world!";
       String str1 = "Hello world!";
       if (str.equals(str1)) System.out.println("Хорошо");
       else if (str == str1) System.out.println("Нехорошо");
    }
}
