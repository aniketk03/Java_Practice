import java.util.Scanner;


//Write a function that takes in the radius as input and returns the circumference of a circle.



public class BasePractice {

    public static float circleCircum (float pi, float n1)
    {
       
            
       return 2*pi*n1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius :");
        Float n1 = sc.nextFloat();
        float pi = 3.14159f;
        float cir = circleCircum(pi,n1);
        System.out.println("Circumference is :: " + cir);
       sc.close();

    }
    
}
