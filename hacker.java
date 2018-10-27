
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
        String st=sc.next();
        char[] ch=st.toCharArray();
        int n=ch.length;
       for( int i=0;i<=n-1;i++){
            if(i%2==0){
                System.out.print(ch[i]);
            }
            }
         System.out.print(" ");
        for(int i=0;i<=n-1;i++){
            if(i%2==1)
            {
             System.out.print(ch[i]);
            }
            
         }
        System.out.print("\n");
        }
            
         }
