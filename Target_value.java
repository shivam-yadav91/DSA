public class Target_value {
    public static void main(String[] args) {

        int[] a = {-7, 9, 2, 37, 9, 11, 52};
        int target = 52;

        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                System.out.println("Target value found at index: " + i);
            }
        }
    }
}

