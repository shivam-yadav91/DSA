public class DuplicateofSorted{
    public static void main(String[]args){
        int[]a = {0,0,3,3,5,6};
        int k = 1;
        for(int i=1; i<a.length; i++){
            if(a[i] != a[i-1]){
                a[k] = a[i];
                k++;
            }

        }
        System.out.println("unique:" + k);

        for(int i = 0; i < k; i++){
            System.out.print(a[i] + " ");
        }
    }
}