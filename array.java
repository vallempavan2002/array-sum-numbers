import java.util.*;
public class Main 
{
        public static void main(String [] args)
        {
              Scanner sc=new Scanner(System.in);
              int arr[]=new int [5];
              int temp=0;
              int a=arr[1],b=arr[1];
              System.out.println("enter the number :");
              for(int i=0;i<arr.length;i++)
              {
                      arr[i]=sc.nextInt();
              }
                for(int i=0;i<arr.length;i++)
                {
                 for( int j=i+1;j<arr.length;j++)       
                 {
                         if(arr[j]>arr[i])
                         {
                                 temp=arr[i];
                                 arr[i]=arr[j];
                                 arr[j]=temp;
                                      
                         }
                          a=arr[1];
                 }
                }
                System.out.println("second largest number :"+a);
                for(int i=0;i<arr.length;i++)
              {
                      arr[i]=sc.nextInt();
              }
                for(int i=0;i<arr.length;i++)
                {
                 for( int j=i+1;j<arr.length;j++)       
                 {
                         if(arr[j]<arr[i])
                         {
                                 temp=arr[i];
                                 arr[i]=arr[j];
                                 arr[j]=temp;
                               
                         }
                          b=arr[1];
                 }
                }
                System.out.println("second lowest number :"+b);
                 {
    
    
    System.out.println("sum of the two numbers :");
    int largest= a;
    int lowest= b;
     int sum =largest+lowest;
    System.out.println("The sum is " + largest+"+"+ lowest+" ="+sum );
  }
        }
        
}
