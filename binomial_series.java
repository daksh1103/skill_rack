import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        for(int h=0;h<n;h++){
            double sum=a;
            for(int k=0;k<=h;k++){
                      sum=sum+(b*(Math.pow(2,k)));
                
               }
            int s=(int)sum;
            System.out.print(s+" ");
   
        }
        System.out.print("\n");
        }
        in.close();
    }
}
