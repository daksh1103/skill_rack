//Array of size b get a sliding window of k and print maximum value
import java.util.*;
	public class e {

	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int b=sc.nextInt();
			
			int a=sc.nextInt();
			int[] c=new int[b];
			for(int i=0;i<b;i++){
			    c[i]=sc.nextInt();
			}
			for(int i=0;i<=b-a;i++){
			   int l=a;
			   int max=0;
			   int g=i;
	while(l>0){
	
	    if(c[g]>max){
	        max=c[g];
	       g++;
	        l--;
	    }
	}
	System.out.print(max+" ");

		}
	}

}
