import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		char pos=sc.next().charAt(0);
		int count=0;
	switch(pos){
	    case 'L':
	        for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c-1;j++)
	        {
	            if(a[i][j]==1&&a[i][j+1]==0)
	            {
	                count++;
	            }
	        }
	    }
	    break;
	    
	    case 'B':
	        for(int j=0;j<c;j++)
	        {
	            for(int i=0;i<r-1;i++){
	                if(a[i][j]==1&&a[i+1][j]==0){
	                    count++;
	                }
	            }
	        }
	    break;
	    case 'R':
	        for(int i=0;i<r;i++){
	            for(int j=c-1;j>0;j--){
	                if(a[i][j]==1&&a[i][j-1]==0){
	                    count++;
	                }
	            }
	        }
	        break;
	        case 'F':
	            for(int j=0;j<c;j++){
	                for(int i=r-1;i>0;i--){
	                    if(a[i][j]==1&&a[i-1][j]==0){
	                        count++;
	                    }
	                }
	            }
	        break;
	    
	}
	    
	    System.out.println(count);
        
	}
}
