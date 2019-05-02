package JavaStudy;
import java.util.Arrays;
import java.util.Scanner;

public class ZeroEnd{
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
       result = zeroEnd(arr, n);
       System.out.println("New Array ");
       System.out.println(Arrays.toString(result));
     }
    
  static int [] zeroEnd(int arr[], int n)
  {
	  int count_0=0,count_1=0;
	  int len=arr.length;
	  int arr2[]=new int[len];
	  for(int i=0;i<len;i++)
	  {
		  if(arr[i]==1)
		  {
			  count_1++;
			  
		  }
		  //System.out.println("count_1"+count_1);
	  }
	  for(int i=0;i<len;i++)
	  {
		  if(arr[i]==0)
		  {
			  count_0++;
			  
		  }
		  //System.out.println("count_0"+count_0);
	  }
	  for(int j=0;j<count_1;j++){
		  arr2[j]=1;
	  }
	  for(int j=0;j<len;j++){
		  if(arr[j]!=1 &&arr[j]!=0){
			  arr2[count_1++]=arr[j];
		  }
	  }
	 // System.out.println("new count_1"+count_1);
	  for(int j=count_1;j<len;j++){
		  arr2[j]=0;
	  }
	  return arr2;
     }
  }