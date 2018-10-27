import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(a[i]>0){
		        if(a[i]%2==0){
		            count=count+1;
		        }
		        else
		        {
		            count1=count1+1;
		        }
		    }
		    else if(a[i]<0){
		        count2=count2+1;
		    }
		}
System.out.print(count1+" "+count+count2);
	}
}

