package ArrayQuestions;

import java.util.Arrays;

public class Answers1 {
    public static void main(String[] args) {
        int x = 0;
        int [] a = new int[4];
        x = x +1;
        mystery(x,a);
        System.out.println(x + " "+ Arrays.toString(a));
        x = x +1;
        mystery(x,a);
    }

    private static void mystery(int x, int[] a) {
        x= x+1;
        a[x] = a[x]+ 1;
        System.out.println(x + " " + Arrays.toString(a));
    }
}
