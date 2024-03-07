import java.util.Scanner;

//Two Dimension array

public class Array {
     
    public static void main(String[] args) {
        
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row and Column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        System.out.println("Enter The Elements :: ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
             arr[i][j] = sc.nextInt();
            }
        }

        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
             System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    
}
