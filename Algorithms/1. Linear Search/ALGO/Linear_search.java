import java.util.Scanner;

import java.util.Arrays;

// Binary search in java

public class Main
{
    
    static int search(int [] ara , int target)
    {
        for(int i = 0 ; i < ara.length ; i++)
        {
            if(ara[i] == target)
            {
               System.out.println(" your number is on the index : " + i);
               return 0;
            }
        }
        
        System.out.println(" cannot find your number" );
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int size;
        size = input.nextInt();
        
        int[] ara ;               // declaration of the array
        
        ara = new int[size];     // memory allocation in the array
        
        for(int i = 0 ; i < size ; i++)
        {
            ara[i] = input.nextInt();
        }
        
        int key ;
        
        key = input.nextInt();
        
       search(ara, key);
        
        
    }
};