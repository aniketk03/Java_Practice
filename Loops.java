




public class Loops {

    public static void main(String[] args) {
    //for loop design patterns  
    //hollow rectangle pattern  
    // 
    //    *****   
    //    *   *
    //    *   * 
    //    *****
   
        int i=1, j=1, ni=4, nj=5;
        for(i=1; i<=ni; i++)
        {
            for(j=1; j<=nj; j++)
            {
                if(i==1 || j==1 || i ==4 || j ==5)
                {
                System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println(" ");//this for new line after each line
        }

}
}
