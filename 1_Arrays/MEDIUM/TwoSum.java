//Using hashmap
import java.util.HashMap;
public class TwoSum{
    public static void main(String[] args) {
        int[] arr={23,12,15,21,20};
        int sum=27;
        int[] ans=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(sum-arr[i])){
                ans[0]=i;
                ans[1]=map.get(sum-arr[i]);
            }
            map.put(arr[i],i);
        }
        System.out.println("Two indices are:");
        System.out.println(ans[0]+" "+ans[1]);
    }
}