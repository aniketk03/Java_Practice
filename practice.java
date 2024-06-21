
import java.util.Scanner;
public class practice {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the Number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c = sc.nextInt();
        String s[][] = new String[r][c];
        for(i=0;i<s.length;i++)
        {
            for(j=0;j<c;j++)
            {
                s[i][j] = sc.next();
        }
       
    }

    for(i=0;i<s.length;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(s[i][j]+ "  ");
        }
        System.out.println("");
       
    }
}
    
}
