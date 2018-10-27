/* To print the following pattern
1
2*3
4*5*6
*/
public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=2*i-1;j++){
                if(j%2==1){
                count++;
            System.out.print(count);
        }
                else{
                    System.out.print("*");
                }
        }
            System.out.print("\n");
    }
}
}
