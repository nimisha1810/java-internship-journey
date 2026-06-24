import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter numerator:");
            int num = sc.nextInt();
            System.out.println("Enter denominator:");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Result =" + result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally{
            System.out.println("Program execution completed");
            sc.close();
        }
    }
}
