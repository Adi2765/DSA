// Second Largest element in array
public class q1 {
    public static void main(String args[]){
        int[] arr={10,21,5,39,35,15};
        int max=0;
        int second_max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=max)
                second_max=arr[i];
        }
        System.out.println("Second largest element:"+second_max);
    }
}
