import java.util.ArrayList;
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

/*class Solution {
    static String revStr(String s) {
        // code here
      String reversed = new StringBuilder(s).reverse().toString();
      return reversed;
    }
} */

/*
 * string str2=" ";
 * for(int i=str.length()-1;i>=0;i--)
 * {
 * str2=str2+s.charAt(i);
 * }
 * return str2;
 */