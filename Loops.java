




public class Loops {

    public static void main(String[] args) {
    //for loop design patterns  
    //Floyad's Triangle 
    // 
    //   1  
    //   23 
    //   456  
    //   78910
    
   
        int i=4, j=1, ni=4, nj=4;
        int number =1;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
               System.out.print(number);
               number++;
            }
            System.out.println(" ");//this for new line after each line
        }

}
}
