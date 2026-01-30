// Using two pointers
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {23,12,15,21,20};
        int sum = 27;

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int currSum = arr[i] + arr[j];

            if(currSum > sum){
                j--;
            }
            else if(currSum < sum){
                i++;
            }
            else{
                System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                break;
            }
        }
    }
}
