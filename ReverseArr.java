import java.util.Scanner;
class ReverseArr{
    public static void main(String args[]){
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter no. of arrays: ");
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        System.out.print("Array element: : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Reverse arrays: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        }

}