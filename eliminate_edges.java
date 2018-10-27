Scanner sc=new Scanner(System.in);
String s=sc.next();
int l=s.length();
int e=l;
int x=0,y=0;
if(l%2==0)
    x=l/2;
else
    x=(l/2)+1;
for(int i=0;i<x;i++)
{
    for(int j=y;j<e;j++)
        System.out.print(s.charAt(j));
    System.out.println();
    y++;
    e--;
}
