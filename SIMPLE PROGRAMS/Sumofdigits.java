import java.util.*;
public class Sumofdigits {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int num=sc.nextInt();
        int sum=0;
        int mod;
        while(num!=0)
        {
            mod=num%10;
            sum=sum+mod;
            num=num/10;
        }
        System.out.println(sum);

    }
    
}
