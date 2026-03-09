public class SecondLargest{
    public static void main(String[]args){
        int []a ={8,8,7,6,5};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i < a.length; i++){
            if(a[i] > largest){
                secondlargest = largest;
                largest = a[i];
            }
            else if(a[i] > secondlargest && a[i] != largest){
                secondlargest = a[i];
            }
        }
        System.out.println(secondlargest);
    }
}