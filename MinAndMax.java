public class MinAndMax {
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int arr[]={4,3,1,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max value: "+max);
        System.out.println("Min value: "+min);
        
    }
}
