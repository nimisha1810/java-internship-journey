import java.util.Scanner;
public class ArrayOperations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter 10 integers:");
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1; i<10; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest element =" + largest);
        System.out.println("Smallest element =" + smallest);
        sc.close();
    }
}
