import java.util.*;
public class DuplicateElements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if (arr[i]==arr[j])
            {
                System.out.print(arr[j]+ " ");
            }

        }
    }
    }
}
