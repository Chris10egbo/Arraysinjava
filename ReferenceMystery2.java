package ArrayQuestions;

import java.util.Arrays;

public class ReferenceMystery2 {
    public static void main(String[] args) {
        int x = 1;
        int [] a = new int[2];
        mystery(x,a);
        System.out.println(x + " " + Arrays.toString(a));
        x--;
        a[1] = a.length;
        mystery(x,a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    private static void mystery(int x, int[] list) {
        list[x]++;
        x++;
        System.out.println(x+ " " + Arrays.toString(list));
    }
}
