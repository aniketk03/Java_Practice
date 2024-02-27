import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int , string, char, float, double :");
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        char c = sc.next().charAt(0);
        float d  = sc.nextFloat();
        double e = sc.nextDouble();

        System.out.println(a + b + c + d + e);

        sc.close();
    }
}





