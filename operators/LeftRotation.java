public class LeftRotation{
    public static void solution(int[],arr,int k) {
        int n=arr.length;
        k = k%n;
        int[] temp =new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];

        }   
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }   
       int j=0;
       for(int i=n-k;i<n;i++){
        arr[i]=temp[j];
        j++;
       }     
    }
}