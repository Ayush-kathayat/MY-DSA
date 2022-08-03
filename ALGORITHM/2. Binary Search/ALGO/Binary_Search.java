import java.util.Scanner;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        int[] ara = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 19 ,20};

        int start = 0;
        
        int end = ara.length;
        
        int mid ;
        int key ;
        key = 8;
        while(start < end)
        {
            mid = (start+end)/2;
            
            if(ara[mid] == key)
            {
                System.out.println(" number found on the index : " + mid);
                break;
            }
            
            if(ara[mid] < key)
            {
                start = (mid + 1);
            }
            
            if(ara[mid] > key)
            {
                end = (mid + 1);
            }
            
            
        }
    }
}