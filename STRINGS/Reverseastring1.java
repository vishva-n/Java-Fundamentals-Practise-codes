import java.util.*;
public class Reverseastring1 {
    public static void main (String[] args)
    {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String s = sc.nextLine();

    char[] charArr = s.toCharArray();
    //System.out.println(charArr);
    
    for(int i=charArr.length-1;i>=0;i--)
    {
        System.out.print(charArr[i]);
    }


}
}
