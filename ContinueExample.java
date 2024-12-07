import java.util.*;
public class ContinueExample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Break");
        for(int i=0;i<5;i++)
        {
            if(i==5)
            continue;
            System.out.println(i);

        }

    }
}