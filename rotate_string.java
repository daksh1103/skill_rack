import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
String str=sc.next();
char[] a=str.toCharArray();
int len=a.length;
int d=sc.nextInt();
char[] b=new char[len];
int h=0;
for(int i=len-d;i<len;i++){
    b[h]=a[i];
    h++;
}
for(int i=0;i<len-d;i++){
    b[h]=a[i];
    h++;
}
for(int j=0;j<len;j++){
    System.out.print(b[j]);
    
}
