import java.util.Scanner;
public class simpleAndCompoundInterest {
    public static double simpleInterest(double p, double r, double n){
        return (p*n*r)/100.0;
    }
    public static double compoundInterest(double p, double r, double n){
        double amount = p;
        double factor = 1+(r/100.0);
        for(int i=0;i<n;i++){
            amount = amount * factor;
        }
        return amount-p;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter years: ");
        double years = sc.nextDouble();

        System.out.println("Simple Interest: " + simpleInterest(amount, rate, years));
        System.out.println("Compound Interest: " + compoundInterest(amount, rate, years));
    }
}
