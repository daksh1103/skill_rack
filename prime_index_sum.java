import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	for(int i=2;i<n;i++){
	    int flag=0;
	    for(int j=2;j<n;j++)
	    {
	        if((i%j==0)&&(i!=j)){
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	        sum=sum+a[i];
	    }
	    
	    }
	    System.out.print(sum);
	}
}
