import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<n;i++){
		    flag=0;
		    if(i!=n-1){
		    for(int j=i+1;j<n;j++){
		        if(a[j]>a[i]){
		            System.out.print(a[j]+" ");
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        System.out.print("-1"+" ");
		    }
		}
		else{
		    System.out.print("-1");
		}
		
		}
		

	}
}
