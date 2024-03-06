import java.util.Scanner;

public class Fabonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int fab = 1;
        for(int i=n; i>=1 ; i--)
        {
            fab=fab*i;
           
            System.out.print(i);

            if(i>1)
            {
                System.out.print("*");
            }
            
        }
        
        System.out.print("   : " + fab);
        sc.close();
    }
}