// Longest sub-array with sum 'k'
public class q8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,4,2,3};
        int k = 3;
        int l = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum == k){
                    int len = j - i + 1;
                    if(len > l)
                        l = len;
                }
            }
        }
        System.out.println(l);
    }
}
