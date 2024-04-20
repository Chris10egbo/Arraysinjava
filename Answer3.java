package ArrayQuestions;

public class Answer3 {
    public static void main(String[] args) {
        /*
         * Write a piece of code that prints an array of integers in reverse order
         */
        //int [] list ={ 82, 80, 79, 71, 75, 83};
        int[] list = {4,3,8, 5, 2, 9};
        System.out.println("Original Array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        int [] rev = reversal(list);
        System.out.println("Reversed Array value");
        for (int i : rev) {
            System.out.print(i + " ");
        }
        System.out.println();
        int [] det = moveBackwards(list);
        System.out.println("Shift first element to the last");
        for (int i : det) {
            System.out.print(i + " ");
        }
        System.out.println();
        int [] bet = move2Backwards(list);
        System.out.println("Shift two elements backward value");
        for (int i : bet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static int[] reversal(int[] data) {
        for (int i = 0; i < data.length/2; i++) {
            int temp =  data[i];
            data[i] = data[data.length-1-i];
            data[data.length-1-i] = temp;
        }
        return data;
    }
    // move the first to the last index
    private static int[] moveBackwards(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int temp = data[i];
            data[i] = data[i+1];
            data[i+1] = temp;
        }
        return data;

    }
    // move the first and second number to the last index
    private static int[] move2Backwards(int[] data) {
        for (int i = 0; i < data.length-2; i++) {
            int temp = data[i];
            data[i] = data[i+2];
            data[i+2] = temp;
        }
        return data;

    }
}
