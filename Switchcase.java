import java.util.Scanner;


public class Switchcase {
    int ch;
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. JAVA ");
        System.out.println("2. C ");
        System.out.println("3. C++ ");
        System.out.println("Enter Your Choice :: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Your Selected Language is JAVA ");
                break;
        
            case 2:
                System.out.println("Your Selected Language is C");
                break;
            
            default:
                System.out.println("Your Selected Language is C++");
                break;
        }
        sc.close();

    }
    
}
