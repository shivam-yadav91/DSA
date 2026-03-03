public class RemoveDuplicate {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}