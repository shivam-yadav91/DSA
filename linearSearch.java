public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,6,9,10,46};
        int target = 9;
        int index = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(arr[i]);
                index = i;
                break;
            }
        }
            if(index != -1){
                System.out.println("element is found at" + index);
            }
            else{
                System.out.println("element is not found");
            }
    }
}