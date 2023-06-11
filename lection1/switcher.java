package lection1;

import java.util.Scanner;

public class switcher {
    public static void main(String[] args) {
        int month = 2;
        String text = "";
        switch (month) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}
