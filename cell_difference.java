import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+2];
		int[] b=new int[n];
		a[n+1]=0;
		a[0]=0;
		for(int i=1;i<=n;i++){
		   a[i]=sc.nextInt(); 
		}
		int d=0;
		int k=0;
		int p=0;
		for(int i=1;i<=n;i++){
		    d=a[i+1]-a[i-1];
		    k=Math.abs(d);
		    b[p]=a[i]+k;
		    p++;
		    
		}
		for(int i=0;i<p;i++){
		    System.out.print(b[i]+" ");
		    
		}
		

	}
}
