




public class Loops {

    public static void main(String[] args) {
    //for loop design patterns  
    //Half Pyramid pattern With Numbers  
    // 
    //   1  
    //   12 
    //   123  
    //   1234
    
   
        int i=4, j=1, ni=4, nj=4;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
               System.out.print(j);
            }
            System.out.println(" ");//this for new line after each line
        }

}
}
