import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++){
	    if(i%2==0){
	        for(int j=0;j<n;j++){
	            if(i<=j){
	                a[j][i]=++count;
	            }
	        }
	    }
	    else{
	        for(int j=n-1;j>=0;j--){
	            if(i<=j){
	                a[j][i]=++count;
	            }
	        }
	    }
	}
	
	for(int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	}
	                }
	    
	    }
