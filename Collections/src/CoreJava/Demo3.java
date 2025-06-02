package CoreJava;

public class Demo3 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 3, 67, 23};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
