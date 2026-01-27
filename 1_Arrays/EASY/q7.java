//Maximum consecutive zeroes
public class q7 {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,0,0,1,1,1,1,0,0,0};
        int count=0;
        int maxcount=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                count++;
                if(arr[i+1]!=0){
                    if(maxcount<count)
                    maxcount=count;
                    count=0;
                }   
            }
        }
        System.out.println(maxcount);
    }
    
}
