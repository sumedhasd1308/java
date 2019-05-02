package JavaStudy;
import java.util.Scanner;

public class lexography {





public static void getSmallestAndLargest (String str,int k) {
   
    //anner scan=new Scanner(System.in);
    //String str=scan.next();
    //int k=scan.nextInt();
    java.util.SortedSet<String> sets=new java.util.TreeSet<String>();
    for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
    

}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        getSmallestAndLargest(s, k);
    }
}