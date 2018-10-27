import java.util.*;
import.java.Math.BigInteger;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
BigInteger  n=new BigInteger(sc.next());
BigInteger  i=new BigInteger(“1”);
BigInteger  r=new BigInteger(“0”);
BigInteger  b=new BigInteger(“0”);
BigInteger  x=new BigInteger(“0”);
BigInteger  y=new BigInteger(“2”);
BigInteger  z=new BigInteger(“10”);
While(n.compareTo(x)>0){
{
r=n.remainder(y);
b=b.add(r.multiply(i));
n=n.divide(y);
i=i.multiply(z);
}
System.out.print(b.toString());
}
