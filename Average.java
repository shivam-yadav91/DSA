public class Average {
    public static void main(String[] args) {

        int[] a = {5, 4, 0, -1, -3};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        int average = sum / a.length;

        System.out.println("Average is: " + average);
    }
}
