import java.util.*;
public class ReverseanArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        System.out.println("Enter the values for the matrix:");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
