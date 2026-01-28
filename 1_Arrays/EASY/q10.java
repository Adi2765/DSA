//longest subarray with sum 'k' using two-pointers.
//it is recommended to use hashmap in case of negative nos and zeroes.
public class q10 {
    public static void main(String[] args){
        int arr[] = {1,2,3,1,1,1,4,2,3};
        int k=3;
        int i=0;
        int sum=0;
        int l=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            while(sum > k){
                sum -= arr[i];
                i++;
            }
            if(sum==k){
                l=Math.max(l,j-i+1);
            }
        }
        System.out.println(l);
    }
}
