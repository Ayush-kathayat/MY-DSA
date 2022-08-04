import java.util.Scanner;

import java.util.Arrays;

public class Main
{
    static void a_sort(int[] ara , int key)
    {
        int start = 0;
        
        int end   = ara.length;
        
        int mid ;
        
        while( start < end)
        {
            
            mid = (start + end)/2;
            
            if(ara[mid] == key)
            {
                System.out.println("NUMBER FOUND AT THE INDEX : " + mid);
                break;
            }
            
            if(ara[mid] < key)
            {
                start = (mid + 1);
            }
            
            if(ara[mid] > key)
            {
                end = (mid - 1);
            }
                
            
        }
        
        
    }
    
    static void d_sort(int[] ara , int key)
    {
    
        int start = 0;
        
        int end   = ara.length;
        
        int mid ;
        
        while( start < end)
        {
            
            mid = (start + end)/2;
            
            if(ara[mid] == key)
            {
                System.out.println("NUMBER FOUND AT THE INDEX : " + mid);
                break;
            }
            
            if(ara[mid] < key)
            {
                end = (mid - 1);
            }
            
            if(ara[mid] > key)
            {
                start = (mid + 1);
            }
                
            
        }
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("ENTER THE SIZE OF THE ARRAY ");
        
        int size;
        
        size = input.nextInt();
        
        System.out.println(" NOW ENTER A SORTED ARRAY ");
        
        int[] ara;
        
        ara = new int[size];
        
        for(int i = 0 ; i < size ; i++)
        {
            ara[i] = input.nextInt();
        }
        
        System.out.println(" NOW ENTER THE TARGET");
        int key ;
        
        key = input.nextInt();
        
        
        if(ara[0] < ara[size-1])
        {
            a_sort(ara , key);
        }
        else
        {
            d_sort(ara , key);
        }
        
    }
}