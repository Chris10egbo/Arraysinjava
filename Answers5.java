package ArrayQuestions;

import java.util.Arrays;

public class Answers5 {
    public static void main(String[] args) {
        int [] numbers = {3,7,1,0,25,4,18,-1,5};
        mystery(numbers, 3,1);
        mystery(numbers, 5,6);
        mystery(numbers, 8,4);
    }

    private static void mystery(int[] data, int x, int y) {
        data[data[x]] = data[y];
        data[y] = x;
        System.out.println(Arrays.toString(data));

    }
}
