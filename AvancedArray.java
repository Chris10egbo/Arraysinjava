package ArrayQuestions;

public class AvancedArray {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50,60,70,80,90,100};
        for (int i = 0; i < 9; i++) {
            numbers[i]= numbers[i+1];
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            numbers[i] = numbers[i-1];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
}
