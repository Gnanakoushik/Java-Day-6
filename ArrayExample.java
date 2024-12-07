import java.util.*;
public class ArrayExample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //initialization of array
        int arr[]={22,23,45,98,86,};
        System.out.println(Arrays.toString(arr));
        //Accessing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modification of array
        arr[2]=145;
        arr[2]=345;
        System.out.println(Arrays.toString(arr));
    }
}