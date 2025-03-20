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
/*public static boolean prime(int n) {
    if (n <= 1) 
        return false;
    if (n == 2) 
        return true; // 2 is the only even prime number
    if (n % 2 == 0) 
        return false; // Even numbers greater than 2 are not prime
    
    for (int i = 3; i * i <= n; i += 2) { // Check only odd numbers up to sqrt(n)
        if (n % i == 0) 
            return false;
    }
    return true;
} */

