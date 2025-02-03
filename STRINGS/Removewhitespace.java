import java.util.*;
public class Removewhitespace {
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String s=sc.nextLine();

    String s2=s.replaceAll("\\s", "");
    System.out.println(s2);
}}
