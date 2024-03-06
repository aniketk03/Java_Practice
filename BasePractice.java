import java.util.Scanner;


//Write a function which takes in 2 numbers and returns the greater of those two.



public class BasePractice {

    public static int greaterNumber (int n1, int n2)
    {
        if(n1>n2)
        {
            
            return n1;
        }
        else
            
       return n2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers Number :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int GreaterNumber = greaterNumber(n1, n2);
        System.out.println("Greater Number is :: " + GreaterNumber);
       sc.close();

    }
    
}
