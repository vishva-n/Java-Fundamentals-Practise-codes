import java.util.*;
public class PrimeNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num==0 || num==1)
        System.out.println("not a prime number");
        else{
        for (int i=2;i<=num/2;)
        {
            if(num%i==0)
            System.out.println(num + " " +"is not a Prime number");
        
            else
            System.out.println(num + " "+ "is a Prime number");
            break;
    
        }
            
            
    }
    }
    
}

