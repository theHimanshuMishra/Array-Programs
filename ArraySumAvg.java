import java.util.*;
class ArraySumAvg{
    public static void main(String args[]){
        System.out.print("Enter size of array: ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int a[]=new int[size];
        int sum=0;
        double avg;
       
        System.out.println("Enter Array element: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Given elements printed: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            sum=a[i]+sum;
            
        }
        System.out.println("");
        avg=sum/size;
        System.out.println("Sum of element: "+sum);
        System.out.println("Avg of element: "+avg);
    }
}