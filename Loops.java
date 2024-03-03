




public class Loops {

    public static void main(String[] args) {
    //for loop design patterns  
    //Half Invert Pyramid pattern  
    // 
    //    ****   
    //    *** 
    //    **  
    //    *
    
   
        int i=4, j=1, ni=4, nj=4;
        for(i=4; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
               System.out.print("*");
            }
            System.out.println(" ");//this for new line after each line
        }

}
}
