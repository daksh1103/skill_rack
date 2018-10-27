
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double a=((mealCost*tipPercent)/100);
        double b=((mealCost*taxPercent)/100);
        double c=mealCost+a+b;
      
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(c);
     
        System.out.print("The total meal cost is "+totalCost+" dollars.");
    }
}
