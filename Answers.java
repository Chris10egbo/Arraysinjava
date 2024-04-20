package ArrayQuestions;

import java.util.Arrays;

public class Answers {
    public static void main(String[] args) {
        
        int [] first = new int[2];
        first[0] = 3;
        first[1]= 7;
        int [] second = new int[2];
        second[0] = 3;
        second[1]= 7;
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        if (first == second) {
            System.out.println("They contains the same elements");
        }else{
            System.out.println("The elements are not the same");
        }
    }
}
