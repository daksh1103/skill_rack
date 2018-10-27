import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int max=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
Int min=a[0];
		for(int i=0;i<n;i++){
		    if((a[i]%10)>(max%10))
		    {
		        max=a[i];
		    }
		    if((a[i]%10)==(max%10)){
		        if(a[i]>max){
		            max=a[i];
		        }
		    }
		}
		for(int i=1;i<n;i++){
		    if((a[i]%10)<(min%10)){
		        min=a[i];
		    }
		    if((a[i]%10)==(min%10)){
		        if(a[i]<min){
		            min=a[i];
		        }
		    }
		}
		
		
		
		
	int y=max-min;
		System.out.print(y);
	}
}
