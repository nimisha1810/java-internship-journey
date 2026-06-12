import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Principal amount:");
        double principal = sc.nextDouble();
        System.out.println("enter Rate of interest:");
        double rate = sc.nextDouble();
        System.out.println("enter Time in years:");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
         sc.close();    
    }
}
    

