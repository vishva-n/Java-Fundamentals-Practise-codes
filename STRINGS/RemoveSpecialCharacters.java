import java.util.Scanner;
public class RemoveSpecialCharacters {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        String s2=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s2);
    }
    
}
