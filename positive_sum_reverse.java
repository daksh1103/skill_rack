
import java.util.*;
public class Hello {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int sum=0;
    int b=0;
    int reverse=0;
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for( int i=0;i<n;i++)
    {
        reverse=0;
    if(a[i]%2==0 && a[i]>0)
    { 
        while(a[i]>0){
            
        b=a[i]%10;
        reverse=(reverse*10)+b;
        a[i]=a[i]/10;
        }
        sum=sum+reverse;
        
        }
        else if (a[i]>0)
        {
            sum=sum+a[i];
        }
}
System.out.println(sum);
}
}
