
import java.util.Scanner;



public class ControlStatement {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        /* */ System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");
        System.out.print("Enter The Number ::");
        int n = sc.nextInt();
        System.out.println("Your Entered Number is :: " + n);

        //IF - ELSE
        /*if (n%2==0)
        {
            System.out.println("This is even Number");
        }
        else
            System.out.println("This is Odd Number"); */

        //
        //ELSE IF LADDER
        if(n==1)
        {
            System.out.println("Today is Sunday");
        }
        else if(n==2)
        {
            System.out.println("Today is Monday");
        }
        else if(n==3)
        {
            System.out.println("Today is Tuesday");
        }
        
       else if(n==4)
        {
            System.out.println("Today is Wednesday");
        }
        else if(n==5)
        {
            System.out.println("Today is Thursday");
        }
        else if(n==6)
        {
            System.out.println("Today is Friday");
        }
        else if(n==7)
        {
            System.out.println("Today is Saturday");
        }










        sc.close();
    }
}
