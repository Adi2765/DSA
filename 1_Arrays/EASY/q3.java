//remove duplicate elements
public class q3 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,5,5};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        int nlength=i+1;
        System.out.println("Modified Array:");
        for(int k=0;k<nlength;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
