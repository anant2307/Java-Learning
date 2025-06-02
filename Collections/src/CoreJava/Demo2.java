package CoreJava;

public class Demo2 {
    public static void main(String[] args) {
        int[] numbers = {5, 15, 25, 35};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
