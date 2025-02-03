import java.util.Scanner;
public class StringBufferReverse {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str =sc.nextLine();
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
}
