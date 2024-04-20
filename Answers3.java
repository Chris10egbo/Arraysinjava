package ArrayQuestions;

public class Answers3 {
    public static void main(String[] args) {
        int [] a1 = {1,3,5,7,9};
        int [] a2 = {1,4,9,16,25};
        mystery(a1,a2);
    }

    private static void mystery(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] += b[b.length-1-i];
            System.out.print(a[i] + " " );
            //System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
