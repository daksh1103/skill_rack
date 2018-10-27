import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		String s1=sc.next();
		char[][] b=new char[r][c];
		String s2=sc.next();
		int x1=s1.length();
		int x2=s2.length();
		String s3="";
		String s4="";
		String s5="";
		int count=0;
		int d=r*c;
		int q=d/x1;
		int re=d%x1;
		for(int i=0;i<q;i++){
		    s3=s3+s1;
		}
		for(int i=0;i<re;i++){
		    s3=s3+s1.charAt(i);
		}
		int k=0;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++){
		        b[i][j]=s3.charAt(k++);
		    }
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        s4=s4+b[i][j];
		    }
		        for(int n=0;n<=s4.length()-x2;n++){
		            for(int p=n;p<n+x2;p++){
		                s5=s5+s4.charAt(p);
		            }
		            if(s5.equals(s2))
		            {
		                count++;
		            }
		            s5="";
		        }
		        s4="";
		    }
		    
	for(int i=0;i<c;i++){
	    for(int j=0;j<r;j++){
	        s4=s4+b[j][i];
	    }
	    for(int n=0;n<=s4.length()-x2;n++){
	        for(int p=n;p<n+x2;p++){
	            s5=s5+s4.charAt(p);
	        }
	        if(s5.equals(s2))
	        {
	            count++;
	        }
	        s5="";
	        }
	        s4="";
	    }
System.out.print(count);
	}
}
