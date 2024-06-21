import java.util.Scanner;


//Write a function that takes in the radius as input and returns the circumference of a circle.



public class BasePractice {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int count =0;
        System.out.println("Enter How many Numbers You want :");
        int n1 = sc.nextInt();
        int[ ] num  = new int[n1];
        for( i=0 ; i<=n1; i++)
        {
            num[i] = sc.nextInt();
        }
        if(num[i] > 0)
        {
            count = count + i ;
        }
            sc.close();

    }
    
}
