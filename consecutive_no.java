import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String[] arr=s.split("[a-zA-Z]+");
    int flag=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i].length()==3)
        {
            System.out.println(arr[i]);
            flag=1;
        }
    }
    if(flag==0)
    {
        System.out.print("-1");
        }
    
    }
}
