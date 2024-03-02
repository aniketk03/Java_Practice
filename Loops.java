




public class Loops {

    public static void main(String[] args) {
    //for loop design patterns  
    //Solid rectangle pattern  
    // 
    //    *****   
    //    *****   
    //    ***** 
    //    *****
   
        int i=1, j=1, ni=4, nj=5;
        for(i=1; i<=ni; i++)
        {
            for(j=1; j<=nj; j++)
            {
               System.out.print("*");
            }
            System.out.println(" ");//this for new line after each line
        }

}
}
