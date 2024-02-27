
import java.util.Scanner;



public class ControlStatement {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number ::");
        int n = sc.nextInt();
        System.out.println("Your Entered Number is :: " + n);
        if (n%2==0)
        {
            System.out.println("This is even Number");
        }
        else
            System.out.println("This is Odd Number");


    }
}
