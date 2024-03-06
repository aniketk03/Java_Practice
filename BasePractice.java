import java.util.Scanner;


//Enter 3 numbers from the user & make a function to print their average.


public class BasePractice {

    public static int average (int n1, int n2, int n3)
    {
        int average = (n1+n2+n3)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Three Numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int Average = average(n1,n2,n3);
        System.out.println("The Average is :: " + Average);

    }
    
}
