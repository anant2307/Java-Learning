package CoreJava;

public class Demo5 {
    public static void main(String[] args) {
        int[] original = {100, 200, 300};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.println(num);
        }
    }
}
