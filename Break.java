import java.util.*;
public class Break{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Break");
        for(int i=0;i<5;i++)
        {
            if(i==5)
            break;
            System.out.println(i);

        }

    }
}