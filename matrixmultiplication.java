import java.util.*;
public class matrixmultiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows for 1st matrix:");
        int r1=sc.nextInt();
        System.out.println("Enter no of columns for 1st matrix:");
        int c1=sc.nextInt();
        System.out.println("Enter no of rows for 2nd matrix:");
        int r2=sc.nextInt();
        System.out.println("Enter no of columns for 2nd matrix:");
        int c2=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        if(c1==r2)
        {
            System.out.println("Enter the values for 1st matrix:");
            for( int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    arr1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the values for 2nd matrix:");
            for( int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    arr2[i][j]=sc.nextInt();
                }
            }
            System.out.println("The matrix multiplication is:");
            int arr3[][]=new int[r1][c2];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<r2;k++)
                    {
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                        
                    }
                   
                    System.out.print(arr3[i][j]+" ");
                    
                }
                System.out.println();
            }
        }
        else 
        {
        System.out.println("Cannot multiply");
        }
    }
}
        

