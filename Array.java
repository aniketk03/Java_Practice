import java.util.Scanner;

//Single Dimension array

public class Array {
     
    public static void main(String[] args) {
        
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter The Elements :: ");
        for(i=0; i<size; i++)
        {
             arr[i] = sc.nextInt();
        }

        for(i=0; i<size; i++)
        {
            System.out.println("Array is :: " +arr[i]);
        }
    }
    
}
