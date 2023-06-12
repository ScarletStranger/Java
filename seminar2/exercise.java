package seminar2;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        StringBuilder builder1 = new StringBuilder(null);
        System.out.println("srt1: ");
        String str1 = iScanner.nextLine();
        str1 = builder.toString();
        System.out.println("srt2: ");
        String str2 = iScanner.nextLine();
        str2 = builder.toString();
        iScanner.close();
        // if (str1.contains(str2))
        //     System.out.println("Строка 1 " + str1 + " содержит символы из строки 2 " + str2);
        // else
        //     System.out.println("Строка 1 " + str1 + " не содержит символы из строки 2 " + str2);
        if(str2.reverse(str1)==str1)
    }
}