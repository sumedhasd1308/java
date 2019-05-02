package JavaStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Output_display{
    public static void main(String[] args)
    {
      
       int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
       int arr[]=new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        
        int result[];
        
 
      result = display_0_1(arr, n);
        System.out.println("New Array ");
      System.out.println(Arrays.toString(result));
      }
    
  static int [] display_0_1(int arr[], int n)
     {
        int count = 0;   
     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
 
        for (int i = 0; i < count; i++)
            arr[i] = 1;
 
        for (int i = count; i < n; i++)
            arr[i] = 0;
    
         return arr;
     }  
   }