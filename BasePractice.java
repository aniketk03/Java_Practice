import java.util.Scanner;


//Write a function to print the sum of all odd numbers from 1 to n.


public class BasePractice {

    public static int oddSum (int n1)
    {
        int sum=0;
       for(int i=1; i<=n1; i++)
       {
        if(i%2!=0)
        {
            sum = sum + i;
        }
       }
       return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n1 = sc.nextInt();
        int CalculatedSum = oddSum(n1);
        System.out.println(CalculatedSum);
       

    }
    
}
