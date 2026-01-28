//Longest subarray with sum 'k' using hashmap.
import java.util.HashMap;
public class q9 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[] = {1,2,3,1,1,1,4,2,3};
        int k = 3;
        int sum=0;
        int l=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==k)
                l=i+1;
            if(!map.containsKey(sum))
                map.put(sum,i);
            if(map.containsKey(sum-k))
                l = Math.max(l, i - map.get(sum - k));
        }
        System.out.println(l);
    }
}
