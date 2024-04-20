package ArrayQuestions;

public class Answers6 {
    public static void main(String[] args) {
        //int [] a ={5};
        int [] b = {3,12};
        //int [] c = {4,2,10,8};
       // int [] d = {1,9,3,5,7};
        //int [] e = { 8, 2 ,10,4,10,9};
        int me = mystery(b);
        System.out.println(me);
        
    }

    private static int mystery(int[] list) {
        int x = 0;
        for (int i = 1; i < list.length; i++) {
            int y = list[i] -list[0];
            if (y >x) {
                x=y;
            }
        }
        return x;
    }

}
