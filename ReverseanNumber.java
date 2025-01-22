import java.util.*;
public class ReverseanNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int reverse=0;
        int mod;
        while(num!=0)
        {
            mod=num%10;
            reverse=reverse*10+mod;
            num=num/10;
        }
        System.out.println(reverse);
    }
    
}
