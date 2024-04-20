package ArrayQuestions;

public class Answers2 {
    public static void main(String[] args) {
        /*
         * What elements does the array list contain after the following code is executed?
         */
        int [] list = { 2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i]+ list[i]/list[0];
            System.out.print(list[i]+ " ");
        }
        System.out.println();
        
    }
}
