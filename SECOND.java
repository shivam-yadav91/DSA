public class SECOND{
    public static void main(String[]args){
        int[]a = {5,6,7,8};
        int max = 0;
        int secondmax = max;
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                secondmax = max;
                max = a[i];
            }
        }
        System.out.println(secondmax);
    }
}