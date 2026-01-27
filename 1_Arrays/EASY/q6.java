//move by 'k' places left
public class q6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
    int k=4;
    int temp[]=new int[arr.length];
    for(int i=0;i<k;i++){
        temp[i]=arr[i];
    }
    for(int j=k;j<arr.length;j++){
        arr[j-k]=arr[j];
    }
    for(int z = arr.length - k; z < arr.length; z++){
    arr[z] = temp[z - (arr.length - k)];
    }
    for(int y=0;y<arr.length;y++){
        System.out.print(arr[y]+" ");
    }
    }
}
    

