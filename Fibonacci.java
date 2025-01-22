public class Fibonacci {
    public static void main(String args[])
    {
        int num=5;
        int first_num=0;
        int second_num=1;
        int next;
        for(int i=0;i<num;i++)
        {
            System.out.print(first_num+ " ");
            next=second_num+first_num;
            first_num=second_num;
            second_num=next;
        }

    }
    
}
