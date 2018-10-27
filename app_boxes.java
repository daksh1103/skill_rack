import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int i=0;
        int j=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
            count=count+1;
            break;
                
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
              if((a[i]+a[j]==k)&&(a[i]>0)&&(a[j]>0))
              {
                  count++;
                  int x=a[i];
                  int y=a[j];
                  for(int s=0;s<n;s++)
                  {
                      if(a[s]==x||a[s]==y)
                      a[s]=0;
                  }
                  break;
              }
             
            }
           
        }
       System.out.println(count);
    }
}
