// Check for sorted array
public class q2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,6};
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                flag=1;
        }
        if(flag==0)
            System.out.println("Sorted");
        else
            System.out.println("Unsorted");

    }
}
