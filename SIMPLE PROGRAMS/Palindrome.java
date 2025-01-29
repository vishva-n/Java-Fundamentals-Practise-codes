import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int mod;
        int reverse=0;
        while(num!=0)
        {
            mod=num%10;
            reverse=reverse*10+mod;
            num=num/10;
        }
        System.out.println(reverse);
        if(reverse==temp)
        {
            System.out.println("palindrome");
        }
        System.out.println("not palindrome");
    }
    
}
