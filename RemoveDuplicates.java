public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int k = 1;   // first element is always unique

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }

        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {0,0,3,3,5,6};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
