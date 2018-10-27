Breaking record of highest and lowest 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int[] p=new int[2];
        int max=s[0];
        int min=s[0];
        int count=0,c=0;
        int len=s.length;
        for(int i=1;i<len;i++){
            if(s[i]>max){
                max=s[i];
                count++;
            }
            if(s[i]<min){
                min=s[i];
                c++;
            }
        }
        p[1]=c;
        p[0]=count;
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
