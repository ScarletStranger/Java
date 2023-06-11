package lection1;

public class arrays {
    public static void main(String[] args) {
    int[] array = new int[5];
    System.out.println(array); // 5
    System.out.println(array[3]);// 0
    array[3] = 13;
    System.out.println(array[3]);// 13
    int[] arr[] = new int[4][6];
    for (int[] line : arr) {
        for (int item : line)
            System.out.printf("d", item);
    }
    System.out.println();
    int[][] arr2 = new int[3][7];
    for (int i = 0; i < arr2.length; i++) {
        for (int j = 0; j < arr2[i].length; j++)
            System.out.printf("d", arr2[i][j]);
    }
    System.out.println();
    }
}