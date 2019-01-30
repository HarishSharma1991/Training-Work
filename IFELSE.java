import java.util.*;

public class IFELSE {
    public static void main( String[] args)
    {
        int no;
        Scanner in=new Scanner(System.in);
        no=in.nextInt();
        if ((no%2)==0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }

}
